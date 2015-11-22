package com.mkbz.phelp.database.table;

import android.provider.BaseColumns;

import com.mkbz.phelp.database.Table;

/**
 * Created by MARCELO on 15-11-2015.
 */


//TODO: sql create, columns and entry are wrong
public class OperatorTable implements Table {

    public static final String SQL_CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS operator(id INTEGER PRIMARY KEY AUTOINCREMENT,network_code Integer, name VARCHAR(20) not null,country_id VARCHAR(2) ,FOREIGN KEY(country_id) REFERENCES country(code) )  ";
    public static final String SQL_DROP_TABLE =
            "DROP TABLE IF EXISTS " + OperatorEntry.TABLE_NAME;



    public static final String[] COLUMNS={OperatorEntry.ID,OperatorEntry.NETWORK_CODE,OperatorEntry.NAME,OperatorEntry.COUNTRY};

    @Override
    public String getCreate() {
        return SQL_CREATE_TABLE;
    }

    @Override
    public String getDelete() {
        return SQL_DROP_TABLE;
    }

    @Override
    public String getPersistentData() {
        return INSERT_TABLE;
    }


    protected static abstract class OperatorEntry implements BaseColumns {
        public static final String TABLE_NAME = "operator";
        public static final String ID = "id";
        public static final String NETWORK_CODE = "network_code";
        public static final String COUNTRY = "country_id";
        public static final String NAME = "name";
    }

    private static final String INSERT_TABLE = "INSERT INTO operator (network_code,name,country_id) VALUES (67,'Aquafon','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (88,'A-Mobile','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'AWCC','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'Roshan','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (40,'MTN','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (50,'Etisalat','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (55,'WASEL','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (80,'Salaam','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (88,'Salaam','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'AMC','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Vodafone','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Eagle Mobile','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Plus Communication','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Mobilis','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Djezzy','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Ooredoo','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'Bluesky','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Mobiland','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'UNITEL','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'MOVICEL','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (840,'LIME','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (30,'APUA','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (50,'Digicel','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (920,'LIME','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Movistar','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'Nextel','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (34,'Personal','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (40,'Globalstar','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (70,'Movistar','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (310,'Claro','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (320,'Claro','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (330,'Claro','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (341,'Personal','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (350,'PORT-HABLE','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Beeline','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Karabakh Telecom','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'VivaCell-MTS','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Orange','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'SETAR','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Digicel','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Telstra','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Optus','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Vodafone','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Norfolk Is.','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (14,'AAPT','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (19,'Lycamobile','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (38,'Crazy John's','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (71,'Telstra','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (72,'Telstra','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (90,'Optus','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'A1.net','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'T-Mobile AT','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Orange AT','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'tele.ring','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'Lycamobile','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'Tele2Mobil','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'3AT','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'bob','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (12,'yesss!','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (13,'UPC Mobile','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (15,'Vectone Mobile','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (91,'GSM-R A','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Azercell','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Bakcell','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'FONEX','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Nar Mobile','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Naxtel','ab');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (390,'BTC','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Batelco','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'zain BH','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'VIVA Bahrain','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Batelco','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Grameenphone','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Robi','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Banglalink','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'TeleTalk','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Citycell','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'Airtel','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (600,'LIME','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (750,'Digicel','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'velcom','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'MTS','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'life:)','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Proximus','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Telenet','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Lycamobile','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'Voxbone','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Mobistar','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'BASE','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (67,'DigiCell','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (69,'SMART','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (99,'SMART','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Libercom','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Moov','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'MTN','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'BBCOM','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Glo','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (59,'Cellular One','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (50,'Digicel Bermuda','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (0,'CellOne','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Mobility','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'B-Mobile','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (77,'TashiCell','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Viva','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Entel','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Tigo','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'HT-ERONET','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'m:tel','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (90,'BH Mobile','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Mascom','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Orange','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'BTC Mobile','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'TIM','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'TIM','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'TIM','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Claro BR','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Vivo','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Vivo','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'Vivo','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (15,'Sercomtel','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (23,'Vivo','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (31,'Oi','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (32,'CTBC Celular','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (33,'CTBC Celular','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (34,'CTBC Celular','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (170,'LIME','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (570,'CCT Boatphone','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (770,'Digicel','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'B-Mobile','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'DSTCom','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'M-Tel','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Vivacom','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Telenor','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'????','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (13,'MAX','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Telmob','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Airtel','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Telecel Faso','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Spacetel','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Tempo','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Onatel','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'Smart Mobile','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (82,'Leo','bs');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Cellcard ( Mobitel )','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Smart Axiata','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'qb','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'qb','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Smart Axiata','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Smart Axiata','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'Metfone','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'Beeline','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'Excell','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (18,'Cellcard','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'MTN Cameroon','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Orange','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Nexttel','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (270,'EastLink','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (290,'Airtel Wireless','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (320,'Mobilicity','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (340,'Execulink','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (360,'MiKe','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (361,'Telus','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (370,'Fido','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (380,'Keewaytinook Mobile','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (490,'Wind Mobile','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (500,'Videotron','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (510,'Videotron','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (530,'Keewaytinook Mobile','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (560,'Lynx Mobility','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (590,'Quadro Mobility','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (620,'ICE Wireless','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (640,'Bell','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (653,'Telus','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (655,'MTS','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (656,'TBay','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (657,'Telus','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (660,'MTS','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (680,'SaskTel','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (690,'Bell','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (710,'Globalstar','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (720,'Rogers Wireless','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (760,'Public Mobile','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (780,'SaskTel','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (940,'Wightman Mobility','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (140,'LIME','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (50,'Digicel','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'CTP','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'TC','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Orange','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Nationlink','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Airtel','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Tawali','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Tigo','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'Salam','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'entel','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'movistar','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Claro','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'WOM','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Telef�nica del Sur','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'VTR M�vil','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'WOM','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'entel','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (12,'Colo-Colo M�vil Wanderers M�vil','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (13,'Virgin Mobile','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (99,'Will','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (0,'China Mobile','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'China Unicom','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'China Telecom','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'China Tietong','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'movistar','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Edatel','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'Une-EPM','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (99,'EMCALI','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (101,'Claro','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (103,'Tigo','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (111,'Tigo','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (123,'movistar','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (130,'AVANTEL','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Comoros Telecom','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Airtel','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Libertis Telecom','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Kokanet','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Kolbi ICE','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Kolbi ICE','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Claro','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'movistar','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'fullm�vil','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'T-Mobile','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Tele2','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Vip','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Cytamobile-Vodafone','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'MTN','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'PrimeTel','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (22,'lemontel','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'T-Mobile','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'O2','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Vodafone','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'U:fon','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (99,'Vodafone','kh');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Vodacom','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'airtel','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Supercell','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Libertis Telecom','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (86,'Orange','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (89,'Tigo','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (90,'Africell','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'TDC','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Telenor','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'TetraNet','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'3','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'Vectone Mobile','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'Voxbone','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'SINE','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'TDC','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'SINE','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (12,'Lycamobile','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'Telia','cd');  " +
            "";
            private String aux23="INSERT INTO operator (network_code,name,country_id) VALUES (23,'GSM-R DK','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (77,'Telenor','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Evatis','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'Digicel','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (110,'LIME','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Orange','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Claro','cd');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Telkomcel','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'TT','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Telemor','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (0,'Movistar','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Claro','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'CNT Mobile','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Mobinil','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Vodafone','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Etisalat','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'digicel','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Tigo','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'movistar','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Orange GQ','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Hits GQ','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Eritel','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'EMT','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Elisa','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Tele 2','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'VIVEX','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'ETH-MTN','tl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'sure','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Faroese Telecom','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Vodafone','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Vodafone','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Digicel','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'DNA','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'AINA','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Elisa','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'Vectone Mobile','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (12,'DNA','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (14,'�lcom','fk');  " +
                    "";
                private String aaaspo=
            "INSERT INTO operator (network_code,name,country_id) VALUES (17,'RHK','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (21,'Elisa- Saunalahti','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (26,'Compatel','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (30,'Vectone Mobile','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (31,'Kuiri','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (32,'Voxbone','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (33,'VIRVE','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (34,'Elektrobit Wireless','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (35,'Ukko Mobile','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (91,'Sonera','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Orange','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Orange','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'MobiquiThings','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Sisteer','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'Completel Mobile','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'SFR','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'SFR','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'SFR','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (13,'SFR','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (14,'RFF','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (15,'Free Mobile','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (16,'Free Mobile','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (18,'Voxbone','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'Bouygues','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (24,'MobiquiThings','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (25,'LycaMobile','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (26,'NRJ Mobile','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (31,'Vectone Mobile','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (88,'Bouygues','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (92,'Com4Innov','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Orange','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Only','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Chippie','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'Dauphin','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'Digicel','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (15,'Vodafone','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'Vini','fk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Libertis','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Moov','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Airtel','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Azur','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Gamcel','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Africel','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Comium','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'QCell','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Geocell','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'MagtiCom','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'MagtiCom','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Beeline','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Silknet','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'GlobalCell','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'Silk LTE','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Telekom','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Vodafone','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'E-Plus','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'O2','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'Vodafone','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (12,'Dolphin Telecom','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (15,'Airdata','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'OnePhone','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (33,'simquadrat','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (43,'LYCA','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (77,'E-Plus','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (901,'Debitel','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'MTN','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Vodafone','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'tiGO','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Expresso','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Airtel','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'Globacom','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'Surfline','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Blu','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'GibTel','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'Shine','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Cosmote','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Cosmote','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Vodafone','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'Wind','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Wind','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (14,'Cyta Hellas','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (30,'Digicel','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (110,'Cable & Wireless','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (370,'Docomo','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (250,'iConnect','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Tigo','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'movistar','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (�?,'RED/INTELFON','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Airtel-Vodafone','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (50,'JT','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (55,'Sure Mobile','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Orange S.A.','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Sotelgui','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Telecel Guinee','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'MTN','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Cellcom','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Guinetel','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'MTN Areeba','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Orange','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'Guinetel','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Digicel','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'GT&T Cellink Plus','ga');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Voila','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Digicel','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Natcom','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Claro','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Tigo','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (30,'Hondutel','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (40,'Digicel','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (0,'1O1O / One2Free / New World Mobility / SUNMobile','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'3','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'3 (2G)','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'SmarTone','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'Truphone','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (12,'CMCC HK','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (13,'CMCC HK','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (16,'PCCW Mobile (2G)','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (19,'PCCW Mobile (3G/4G)','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (29,'PCCW Mobile (CDMA)','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Telenor','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (30,'T-Mobile','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (70,'Vodafone','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (71,'UPC Hungary','ht');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'S�minn','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Vodafone','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Vodafone','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Viking','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'On-waves','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'Nova','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (12,'Tal','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'AirTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'AirTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'AirTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (12,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (13,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (14,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (15,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (16,'Airtel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (17,'AIRCEL','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (18,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (19,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (21,'Loop Mobile','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (22,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (24,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (25,'AIRCEL','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (27,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (28,'AIRCEL','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (29,'AIRCEL','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (30,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (31,'AirTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (34,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (36,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (37,'Aircel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (38,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (40,'AirTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (41,'Aircel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (42,'Aircel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (43,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (44,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (45,'Airtel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (46,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (48,'Dishnet Wireless','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (49,'Airtel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (50,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (51,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (52,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (53,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (54,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (55,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (56,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (57,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (58,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (59,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (60,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (62,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (64,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (66,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (67,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (68,'DOLPHIN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (69,'DOLPHIN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (70,'AirTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (71,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (72,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (73,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (74,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (75,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (76,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (77,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (78,'Idea Cellular Ltd','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (79,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (80,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (81,'CellOne','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (82,'Idea','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (83,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (84,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (85,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (86,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (87,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (88,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (89,'Idea','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (90,'AirTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (91,'AIRCEL','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (92,'AirTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (93,'AirTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (94,'AirTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (95,'AirTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (96,'AirTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (97,'AirTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (98,'AirTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (25,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (26,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (27,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (28,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (29,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (30,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (31,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (32,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (33,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (34,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (35,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (36,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (37,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (38,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (39,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (41,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (42,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (43,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (44,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (45,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (46,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (47,'TATA DOCOMO','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (12,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (13,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (14,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (15,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (17,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (18,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (19,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (21,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (22,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (23,'Reliance','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (51,'AirTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (52,'AirTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (53,'AirTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (54,'AirTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (55,'Airtel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (56,'AirTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (66,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (67,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (70,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (750,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (751,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (752,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (753,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (754,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (755,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (756,'Vodafone IN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (799,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (800,'AIRCEL','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (801,'AIRCEL','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (803,'AIRCEL','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (804,'AIRCEL','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (805,'AIRCEL','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (806,'AIRCEL','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (809,'AIRCEL','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (810,'AIRCEL','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (811,'AIRCEL','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (819,'Uninor','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (818,'Uninor','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (820,'Uninor','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (821,'Uninor','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (822,'Uninor','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (827,'Videocon Datacom','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (845,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (846,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (847,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (848,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (849,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (850,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (851,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (852,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (853,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (880,'Uninor','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (908,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (909,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (910,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (911,'IDEA','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (927,'Uninor','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (929,'Uninor','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (0,'PSN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'INDOSAT','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'TelkomFlexi','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'AXIS','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'Smartfren','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Telkomsel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'XL','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (27,'Ceria','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (28,'Fren/Hepi','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (88,'BOLT! Super 4G','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (89,'3','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (99,'Esia','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'IR-MCI (Hamrahe Avval)','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (14,'TKC','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (19,'MTCE (Espadan)','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'Rightel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (32,'Taliya','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (35,'MTN Irancell','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (70,'TCI','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (93,'Iraphone','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Asia Cell','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'SanaTel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'Zain','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (30,'Zain','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (40,'Korek','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (45,'Mobitel','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (62,'Itisaluna','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (92,'Omnnea','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Vodafone','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'3','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Meteor','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'3','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'eMobile','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'Tesco Mobile','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (13,'Lycamobile','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (15,'UPC Mobile','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (16,'Carphone Warehouse','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (36,'Sure Mobile','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (58,'Pronto GSM','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Orange','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Cellcom','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Pelephone','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Jawwal','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Wataniya Mobile','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'Hot Mobile','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'Golan Telecom','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (14,'Youphone','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (15,'Home Cellular','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (16,'Rami Levy','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (18,'Cellact Communications','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (19,'Telzar 019','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (24,'012 Telecom','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'TIM','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Vodafone','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (30,'RFI','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (33,'Poste Mobile','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (35,'Lyca Italy','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (88,'Wind','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (99,'3 Italia','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Moov','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Orange','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'KoZ','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'MTN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'GreenN','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'caf�','is');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (50,'Digicel','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (110,'LIME','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (180,'LIME','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (0,'Y!Mobile','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'KDDI','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'KDDI','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (12,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (13,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (14,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (15,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (16,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (17,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (18,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (19,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (21,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (22,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (23,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (24,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (25,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (26,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (27,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (28,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (29,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (30,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (31,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (32,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (33,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (34,'NTT docomo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (35,'NTT DoCoMo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (36,'NTT DoCoMo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (37,'NTT DoCoMo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (38,'NTT DoCoMo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (39,'NTT DoCoMo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (40,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (41,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (42,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (43,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (44,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (45,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (46,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (47,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (48,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (49,'NTT DoCoMo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (50,'KDDI','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (51,'KDDI','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (52,'KDDI','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (53,'KDDI','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (54,'KDDI','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (55,'KDDI','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (56,'KDDI','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (58,'NTT DoCoMo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (60,'NTT DoCoMo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (61,'NTT DoCoMo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (62,'NTT DoCoMo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (63,'NTT DoCoMo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (64,'NTT DoCoMo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (65,'NTT DoCoMo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (66,'NTT DoCoMo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (67,'NTT DoCoMo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (68,'NTT DoCoMo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (69,'NTT DoCoMo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (70,'au','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (71,'KDDI','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (72,'KDDI','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (73,'KDDI','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (74,'KDDI','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (75,'KDDI','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (76,'KDDI','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (77,'KDDI','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (79,'KDDI','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (87,'NTT DoCoMo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (88,'KDDI','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (89,'KDDI','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (90,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (92,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (93,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (94,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (95,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (96,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (97,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (98,'SoftBank','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (99,'NTT DoCoMo','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Airtel Vodafone','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (50,'JT','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (55,'Sure Mobile','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'zain JO','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'XPress Telecom','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Umniah','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (77,'Orange','jm');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Beeline','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Kcell','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'Altel','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'Kazakhtelecom','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (77,'Tele2.kz','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Safaricom','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Airtel','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'Orange Kenya','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Kiribati - TSKL','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'Kiribati - Frigate Net','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Koryolink','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'SKTelecom','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'LG U+','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'olleh','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Vala','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Z Mobile','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (41,'IPKO','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (41,'D3 Mobile','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'zain KW','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'K.S.C Ooredoo','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Viva','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Beeline','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Fonex','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'MegaCom','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'O!','kz');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'LTC','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'ETL','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'Beeline','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'LMT','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Tele2','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'TRIATEL','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Bite','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'MTS','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'IZZI','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'Camel Mobile','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Alfa','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'mtc touch','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Ogero Mobile','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Vodacom','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Lonestar Cell','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Libercell','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Comium','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'LIBTELCO','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (0,'Libyana','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Madar','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Al-Jeel Phone','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Libya Phone','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Hatef Libya','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Swisscom','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'7acht','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'FL1','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Cubic Telecom','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Omnitel','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'BIT?','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Tele 2','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'LitRail','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Mediafon','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'MEZON','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'POST','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (77,'Tango','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (99,'Orange','la');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'China Telecom','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'China Telecom','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Telekom.mk','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'ONE','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Vip MK','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Airtel','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Orange','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Telma','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'TNM','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Airtel','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'ATUR 450','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'TM Homeline','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (12,'Maxis','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (13,'Celcom','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (150,'Tune Talk','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (152,'Yes','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (156,'Altel','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (16,'DiGi','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (17,'Hotlink','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (18,'U Mobile','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (19,'Celcom','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Dhiraagu','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Ooredoo','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Malitel','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Orange','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Vodafone','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (21,'GO','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (77,'Melita','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Mattel','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Chinguitel','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Mauritel','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Orange','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'MTML','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Emtel','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Nextel','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'Telcel','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (30,'movistar','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (40,'Iusacell / Unefon','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (50,'Iusacell','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (90,'Nextel','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Orange','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Moldcell','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'IDC','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Unit�','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Unit�','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (99,'Unit�','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Office des Telephones','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (88,'Unitel','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (91,'Skytel','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (98,'G-Mobile','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (99,'Mobicom','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Telenor','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'T-Mobile','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'m:tel CG','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (860,'Cable & Wireless','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (0,'M�ditel','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'IAM','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Wana Corporate','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'INWI (Telecommunications)','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'mCel','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Movitel','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'MPT','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'CDMA800','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Ooredoo','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Telenor Myanmar','mo');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'MTC','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'switch','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'TN Mobile','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Digicel','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Namaste / NT Mobile','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Ncell','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Sky/C-Phone','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'SmartCell','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Tele2','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Voiceworks','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Vodafone','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Vectone Mobile / Delight Mobile','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'KPN','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'Lycamobile','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'KPN','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (12,'Telfort','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (15,'Ziggo','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (16,'T-Mobile (BEN)','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (17,'Intercity Zakelijk','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'T-Mobile','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (62,'Voxbone','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (51,'Telcell','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (54,'ECC','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (59,'Chippie','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (60,'Chippie','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (68,'Digicel','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (69,'Digicel','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (76,'Digicel','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (78,'Telbo','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (91,'Chippie','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (94,'Bay�s','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Mobilis','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Vodafone','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Woosh','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Spark NZ','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Skinny','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (24,'2degrees','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (73,'SERCOM','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'SahelCom','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Airtel','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Moov','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Orange','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'Airtel','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (25,'Visafone','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (27,'Smile','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (30,'MTN','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (50,'Glo','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (60,'Etisalat','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Telecom Niue','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Norfolk Telecom','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (110,'IT&E Wireless','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (370,'Docomo','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Telenor','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'NetCom','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Tele2','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Network Norway','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'ICE','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'Phonero','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'TDC','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'Com4','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (23,'Lyca','na');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Omantel','om');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'ooredoo','om');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Mobilink','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'PTCL','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Ufone','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Zong','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'SCO Mobile','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Telenor','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'Warid Pakistan','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'SCO Mobile','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'PNCC','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (80,'Palau Mobile','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Wataniya','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Cable & Wireless','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Claro','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Digicel','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'bmobile','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Digicel','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'VOX','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Claro/Hutchison','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Tigo','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Personal','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Copaco','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Movistar','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Claro (TIM)','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (15,'Viettel Mobile','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (17,'NEXTEL','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Globe','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Smart','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Sun','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (18,'Cure','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (24,'ABS-CBN','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Plus','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'T-Mobile','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Orange','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Play','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'Netia','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'Lycamobile','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Sferia','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'Nordisk Polska','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (12,'Cyfrowy Polsat','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (15,'Aero2','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (16,'Mobyland','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (17,'Aero2','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (33,'Truphone','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (34,'NetWorkS!','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (36,'Vectone Mobile','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (39,'Voxbone','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Vodafone','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'NOS','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'LycaMobile','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'MEO','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'Vectone Mobile / Delight Mobile','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (0,'Open Mobile','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (110,'Claro Puerto Rico','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (120,'tmobile','pk');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'ooredoo','qa');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Vodafone','qa');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Ministry of Interior','qa');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Ministry of Interior','qa');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (0,'Orange','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Outremer','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'SFR Reunion','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Vodafone','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Telekom','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Digi.Mobil','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Telekom/Zapp','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Orange','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (15,'Idilis','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (16,'Lycamobile','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'MTS','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'MegaFon','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'NCC','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'ETK','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Skylink','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'SMARTS','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'Skylink','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'Yota','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (12,'Baykalwestcom','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (12,'Akos','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (14,'MegaFon','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (16,'NTC','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (17,'Utel','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'Tele2','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (32,'Win Mobile','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (35,'MOTIV','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (38,'Tambov GSM','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (39,'Rostelecom','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (50,'MTS','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (54,'TTK','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (99,'Beeline','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'MTN','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (13,'Tigo','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (14,'Airtel','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (17,'Olleh','re');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Sure','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (50,'Digicel','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (70,'Chippie','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (110,'LIME','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Ameris','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'GLOBALTEL','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (70,'Digicel','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (110,'Lime','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Digicel','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (27,'Bluesky','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'PRIMA','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'CSTmovel','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Al Jawal (STC )','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Mobily','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Zain SA','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Virgin Mobile','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (21,'RGSM','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Orange','bl');  ";
                private String aux12123 ="" +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Tigo','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Expresso','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Telenor','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'mt:s','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'VIP','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Cable & Wireless','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Airtel','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Airtel','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Africell','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Africell','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'SierraTel','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'Smart Mobile','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'SingTel','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'SingTel-G18','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'M1','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'StarHub','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (12,'Grid','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Orange','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Telekom','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Swan','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Telekom','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Orange','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'O2','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (99,'�SR','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (40,'Si.mobil','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (41,'Mobitel','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (64,'T-2','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (70,'Tu�mobil','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'BREEZE','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'BeMobile','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Telesom','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'SomaCyber','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Somafone','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Nationlink','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (50,'Hormuud','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (30,'Golis','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (57,'UNITEL','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (60,'Nationlink Telecom','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (67,'Horntel Group','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (71,'Somtel','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (82,'Telcom','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Vodacom','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Telkom','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'Cell C','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'MTN','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (13,'Neotel','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (14,'Neotel','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (19,'iBurst','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'MTN','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Gemtel','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Vivacell','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Zain','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'Sudani','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Vodafone','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Orange','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Yoigo','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'TME','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Vodafone','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'movistar','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'Euskaltel','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'Orange','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (15,'BT','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (16,'TeleCable','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (17,'M�bil R','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (18,'ONO','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (19,'Simyo','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (20,'Fonyou','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (21,'Jazztel','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (22,'DigiMobil','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (24,'Eroski','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (25,'Lycamobile','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (32,'Tuenti','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (51,'ADIF','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Mobitel','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Dialog','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Etisalat','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Airtel','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'Hutch','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Zain SD','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'MTN','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Canar Telecom','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'Sudani One','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Telesur','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Digicel','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Uniqa','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Swazi MTN','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Telia','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'3','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Net 1','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'SWEDEN','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Sweden 3G','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Telenor','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'Tele2','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'Spring Mobil','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (12,'Lycamobile','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (17,'Gotanet','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (19,'Vectone Mobile / Delight Mobile','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (21,'MobiSir','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (24,'Sweden 2G','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (38,'Voxbone','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Swisscom','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Sunrise','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Salt','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'SBB-CFF-FFS','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'Tele4u','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Syriatel','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'MTN','bl');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'FarEasTone','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'APTG','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'FarEasTone','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (9,'VMAX','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'G1','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'Chunghwa LDM','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (88,'FarEasTone','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (89,'T Star','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (92,'Chunghwa','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (97,'Taiwan Mobile','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Tcell','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Tcell','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Megafon Tajikistan','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Babilon-M','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Beeline','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'tiGO','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Zantel','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'Vodacom','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'Airtel','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Sasatel','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (7,'TTCL Mobile','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (8,'Benson Online (BOL)','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'SmileCom','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (0,'my by CAT','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'AIS','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'CAT CDMA','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'AIS 3G','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (4,'truemove H 4G LTE','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (5,'dtac TriNet','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (15,'TOT 3G','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (18,'dtac','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (25,'WE PCT','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (99,'truemove','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Togo Cell','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Moov','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'U-Call','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (88,'Digicel','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (12,'bmobile','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (130,'Digicel','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Orange','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Tunicell','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'OOREDOO TN','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Turkcell','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'Vodafone','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'Avea','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'MTS','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (2,'TM-Cell','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (3,'AGTS CDMA','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (50,'Digicel','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (350,'C&W','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (352,'IslandCom','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'TTC','tw');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (1,'Airtel','ug');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (6,'Vodafone','ug');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (10,'MTN','ug');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (11,'UTL','ug');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (14,'Africell','ug');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (22,'Airtel','ug');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (33,'Smile','ug');  " +
            "INSERT INTO operator (network_code,name,country_id) VALUES (44,'K2','ug');  ";
}
