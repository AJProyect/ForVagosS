package es.cifpcm.forvagosortegas.web.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;



/**
 *
 * @author Santiago Ortega
 */
public class DaoFactory implements ConnectionProvider {

	// private static final Logger LOGGER =
	// LoggerFactory.getLogger(DaoFactory.class);

	private static DaoFactory instance;

	// private DataSource ds;
	private DatabaseConfig dbCfg;

	private DaoFactory() {

		ResourceBundle rb = ResourceBundle.getBundle("database");

		try {
			//InitialContext ctx = new InitialContext();
			dbCfg = new DatabaseConfig(rb.getString("db.driver"), rb.getString("db.url"), rb.getString("db.user"),
					rb.getString("db.pw"));

			// LOGGER.debug("Pidiendo datasource: {}", dbCfg.getDatasourceName());

			Class.forName(dbCfg.getDriverName());

		//} catch (NamingException ex) {
			// LOGGER.error(null, ex);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static synchronized DaoFactory getInstance() {

		if (instance == null) {
			instance = new DaoFactory();
		}

		return instance;
	}

	public Connection getConexion() {

		try {
			Connection conn = DriverManager.getConnection(dbCfg.getUrl(), dbCfg.getUser(), dbCfg.getPassword());
			Class.forName(dbCfg.getDriverName());
			return conn;
		} catch (SQLException | ClassNotFoundException ex) {
			// LOGGER.error(null, ex);
			return null;
		}
	}
	
	public ProvinciaDao getProvinciasDao() {		
		return new ProvinciaDaoImp();
	}
	
	public MunicipioDao getMunicipioDao() {
		return new MunicipioDaoImp();
	}

}
