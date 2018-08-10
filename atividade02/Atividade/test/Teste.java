import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import Usuario.SenhaValidator;
import Usuario.Usuario;
import Usuario.UsuarioDAO;
import Usuario.UsuarioValidator;

public class Teste {
    
    SenhaValidator senha;
    UsuarioDAO userDao;
    Usuario user;
    UsuarioValidator userValidator;
    
    public Teste() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        userDao = mock(UsuarioDAO.class);
        senha = mock(SenhaValidator.class);
        user = new Usuario();
        userValidator = new UsuarioValidator(userDao);
    }
    
    @After
    public void tearDown() {
    }
    
        
    @Test(expected = Exception.class)
    public void nomeInvalido() throws Exception {
        user.setNome("Ana");
        user.setSenha("012345");
        user.setSenhaConfirmada("012345");
        
        when(userDao.getByName("Ana")).thenReturn(user);
        when(senha.verificar("012345")).thenReturn(true);
        
        userValidator.setSenhaValidator(senha);
        assertTrue(userValidator.ehUsuarioValido(user));
    }
    
    @Test(expected = Exception.class)
    public void senhasDiferentes() throws Exception{
        user.setNome("Ana Maria");
        user.setSenha("012345");
        user.setSenhaConfirmada("0123457");
        
        when(userDao.getByName("012345")).thenReturn(user);
        when(senha.verificar("0123457")).thenReturn(true);
        
        userValidator.setSenhaValidator(senha);
        userValidator.ehUsuarioValido(user);
        
    }
       @Test(expected = Exception.class)
    public void senhaInvalida() throws Exception {
        user.setNome("Maria Ana");
        user.setSenha("012345");
        user.setSenhaConfirmada("012345");
        
        when(userDao.getByName("Maria Ana")).thenReturn(user);
        when(senha.verificar("012345")).thenReturn(false);
        
        userValidator.setSenhaValidator(senha);
        userValidator.ehUsuarioValido(user);
    }
    
    @Test
    public void charactersInvalidos() throws Exception{
        user.setNome("Joana Mariá#");
        user.setSenha("012345");
        user.setSenhaConfirmada("012345");
        
        when(userDao.getByName("Joana Mariá#")).thenReturn(user);
        when(senha.verificar("012345")).thenReturn(true);
        
        userValidator.setSenhaValidator(senha);
        assertFalse(userValidator.ehUsuarioValido(user));
    }
    
    @Test
    public void usuarioJaExiste() throws Exception{
        user.setNome("Joana Ana");
        user.setSenha("012345");
        user.setSenhaConfirmada("012345");
        
        when(userDao.getByName("Joana Ana")).thenReturn(user);
        when(senha.verificar("012345")).thenReturn(true);
        
        userValidator.setSenhaValidator(senha);
        userValidator.ehUsuarioValido(user);
    }
    
        @Test
    public void usuarioValido() throws Exception {
        user.setNome("Joana Ana");
        user.setSenha("012345");
        user.setSenhaConfirmada("012345");
        
        when(userDao.getByName("Joana Ana")).thenReturn(user);
        when(senha.verificar("012345")).thenReturn(true);
        
        userValidator.setSenhaValidator(senha);    
        assertTrue(userValidator.ehUsuarioValido(user));
    }
}