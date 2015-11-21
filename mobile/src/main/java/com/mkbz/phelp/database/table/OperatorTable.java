package com.mkbz.phelp.database.table;

import android.provider.BaseColumns;

import com.mkbz.phelp.database.Table;

/**
 * Created by MARCELO on 15-11-2015.
 */


//TODO: sql create, columns and entry are wrong
public class OperatorTable implements Table {

    public static final String SQL_CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS operator(id INTEGER PRIMARY KEY AUTOINCREMENT,network_code Integer, name VARCHAR(20) not null,country_id VARCHAR(2) ,FOREIGN KEY(country_id) REFERENCES country(code) )";
    public static final String SQL_DROP_TABLE =
            "DROP TABLE IF EXISTS " + OperatorEntry.TABLE_NAME;



    public static final String[] COLUMNS={OperatorEntry.ID,OperatorEntry.CODE,OperatorEntry.CODE2,OperatorEntry.NAME};

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
        public static final String CODE = "code";
        public static final String CODE2 = "code2";
        public static final String NAME = "name";
    }

    private static final String INSERT_TABLE = "INSERT INTO operator (network_code,name,country_id) VALUES ('67,'Aquafon','ab'),\n" +
            "\n" +
            "  ('88,'A-Mobile','ab'),\n" +
            "\n" +
            "  ('1,'AWCC','ab'),\n" +
            "\n" +
            "  ('20,'Roshan','ab'),\n" +
            "\n" +
            "  ('40,'MTN','ab'),\n" +
            "\n" +
            "  ('50,'Etisalat','ab'),\n" +
            "\n" +
            "  ('55,'WASEL','ab'),\n" +
            "\n" +
            "  ('80,'Salaam','ab'),\n" +
            "\n" +
            "  ('88,'Salaam','ab'),\n" +
            "\n" +
            "  ('1,'AMC','ab'),\n" +
            "\n" +
            "  ('2,'Vodafone','ab'),\n" +
            "\n" +
            "  ('3,'Eagle Mobile','ab'),\n" +
            "\n" +
            "  ('4,'Plus Communication','ab'),\n" +
            "\n" +
            "  ('1,'Mobilis','ab'),\n" +
            "\n" +
            "  ('2,'Djezzy','ab'),\n" +
            "\n" +
            "  ('3,'Ooredoo','ab'),\n" +
            "\n" +
            "  ('11,'Bluesky','ab'),\n" +
            "\n" +
            "  ('3,'Mobiland','ab'),\n" +
            "\n" +
            "  ('2,'UNITEL','ab'),\n" +
            "\n" +
            "  ('4,'MOVICEL','ab'),\n" +
            "\n" +
            "  ('840,'LIME','ab'),\n" +
            "\n" +
            "  ('30,'APUA','ab'),\n" +
            "\n" +
            "  ('50,'Digicel','ab'),\n" +
            "\n" +
            "  ('920,'LIME','ab'),\n" +
            "\n" +
            "  ('10,'Movistar','ab'),\n" +
            "\n" +
            "  ('20,'Nextel','ab'),\n" +
            "\n" +
            "  ('34,'Personal','ab'),\n" +
            "\n" +
            "  ('40,'Globalstar','ab'),\n" +
            "\n" +
            "  ('70,'Movistar','ab'),\n" +
            "\n" +
            "  ('310,'Claro','ab'),\n" +
            "\n" +
            "  ('320,'Claro','ab'),\n" +
            "\n" +
            "  ('330,'Claro','ab'),\n" +
            "\n" +
            "  ('341,'Personal','ab'),\n" +
            "\n" +
            "  ('350,'PORT-HABLE','ab'),\n" +
            "\n" +
            "  ('1,'Beeline','ab'),\n" +
            "\n" +
            "  ('4,'Karabakh Telecom','ab'),\n" +
            "\n" +
            "  ('5,'VivaCell-MTS','ab'),\n" +
            "\n" +
            "  ('10,'Orange','ab'),\n" +
            "\n" +
            "  ('1,'SETAR','ab'),\n" +
            "\n" +
            "  ('2,'Digicel','ab'),\n" +
            "\n" +
            "  ('1,'Telstra','ab'),\n" +
            "\n" +
            "  ('2,'Optus','ab'),\n" +
            "\n" +
            "  ('3,'Vodafone','ab'),\n" +
            "\n" +
            "  ('10,'Norfolk Is.','ab'),\n" +
            "\n" +
            "  ('14,'AAPT','ab'),\n" +
            "\n" +
            "  ('19,'Lycamobile','ab'),\n" +
            "\n" +
            "  ('38,'Crazy John's','ab'),\n" +
            "\n" +
            "  ('71,'Telstra','ab'),\n" +
            "\n" +
            "  ('72,'Telstra','ab'),\n" +
            "\n" +
            "  ('90,'Optus','ab'),\n" +
            "\n" +
            "  ('1,'A1.net','ab'),\n" +
            "\n" +
            "  ('3,'T-Mobile AT','ab'),\n" +
            "\n" +
            "  ('5,'Orange AT','ab'),\n" +
            "\n" +
            "  ('7,'tele.ring','ab'),\n" +
            "\n" +
            "  ('8,'Lycamobile','ab'),\n" +
            "\n" +
            "  ('9,'Tele2Mobil','ab'),\n" +
            "\n" +
            "  ('10,'3AT','ab'),\n" +
            "\n" +
            "  ('11,'bob','ab'),\n" +
            "\n" +
            "  ('12,'yesss!','ab'),\n" +
            "\n" +
            "  ('13,'UPC Mobile','ab'),\n" +
            "\n" +
            "  ('15,'Vectone Mobile','ab'),\n" +
            "\n" +
            "  ('91,'GSM-R A','ab'),\n" +
            "\n" +
            "  ('1,'Azercell','ab'),\n" +
            "\n" +
            "  ('2,'Bakcell','ab'),\n" +
            "\n" +
            "  ('3,'FONEX','ab'),\n" +
            "\n" +
            "  ('4,'Nar Mobile','ab'),\n" +
            "\n" +
            "  ('6,'Naxtel','ab'),\n" +
            "\n" +
            "  ('390,'BTC','bs'),\n" +
            "\n" +
            "  ('1,'Batelco','bs'),\n" +
            "\n" +
            "  ('2,'zain BH','bs'),\n" +
            "\n" +
            "  ('4,'VIVA Bahrain','bs'),\n" +
            "\n" +
            "  ('5,'Batelco','bs'),\n" +
            "\n" +
            "  ('1,'Grameenphone','bs'),\n" +
            "\n" +
            "  ('2,'Robi','bs'),\n" +
            "\n" +
            "  ('3,'Banglalink','bs'),\n" +
            "\n" +
            "  ('4,'TeleTalk','bs'),\n" +
            "\n" +
            "  ('5,'Citycell','bs'),\n" +
            "\n" +
            "  ('7,'Airtel','bs'),\n" +
            "\n" +
            "  ('600,'LIME','bs'),\n" +
            "\n" +
            "  ('750,'Digicel','bs'),\n" +
            "\n" +
            "  ('1,'velcom','bs'),\n" +
            "\n" +
            "  ('2,'MTS','bs'),\n" +
            "\n" +
            "  ('4,'life:)','bs'),\n" +
            "\n" +
            "  ('1,'Proximus','bs'),\n" +
            "\n" +
            "  ('5,'Telenet','bs'),\n" +
            "\n" +
            "  ('6,'Lycamobile','bs'),\n" +
            "\n" +
            "  ('9,'Voxbone','bs'),\n" +
            "\n" +
            "  ('10,'Mobistar','bs'),\n" +
            "\n" +
            "  ('20,'BASE','bs'),\n" +
            "\n" +
            "  ('67,'DigiCell','bs'),\n" +
            "\n" +
            "  ('69,'SMART','bs'),\n" +
            "\n" +
            "  ('99,'SMART','bs'),\n" +
            "\n" +
            "  ('1,'Libercom','bs'),\n" +
            "\n" +
            "  ('2,'Moov','bs'),\n" +
            "\n" +
            "  ('3,'MTN','bs'),\n" +
            "\n" +
            "  ('4,'BBCOM','bs'),\n" +
            "\n" +
            "  ('5,'Glo','bs'),\n" +
            "\n" +
            "  ('59,'Cellular One','bs'),\n" +
            "\n" +
            "  ('50,'Digicel Bermuda','bs'),\n" +
            "\n" +
            "  ('0,'CellOne','bs'),\n" +
            "\n" +
            "  ('2,'Mobility','bs'),\n" +
            "\n" +
            "  ('11,'B-Mobile','bs'),\n" +
            "\n" +
            "  ('77,'TashiCell','bs'),\n" +
            "\n" +
            "  ('1,'Viva','bs'),\n" +
            "\n" +
            "  ('2,'Entel','bs'),\n" +
            "\n" +
            "  ('3,'Tigo','bs'),\n" +
            "\n" +
            "  ('3,'HT-ERONET','bs'),\n" +
            "\n" +
            "  ('5,'m:tel','bs'),\n" +
            "\n" +
            "  ('90,'BH Mobile','bs'),\n" +
            "\n" +
            "  ('1,'Mascom','bs'),\n" +
            "\n" +
            "  ('2,'Orange','bs'),\n" +
            "\n" +
            "  ('4,'BTC Mobile','bs'),\n" +
            "\n" +
            "  ('2,'TIM','bs'),\n" +
            "\n" +
            "  ('3,'TIM','bs'),\n" +
            "\n" +
            "  ('4,'TIM','bs'),\n" +
            "\n" +
            "  ('5,'Claro BR','bs'),\n" +
            "\n" +
            "  ('6,'Vivo','bs'),\n" +
            "\n" +
            "  ('10,'Vivo','bs'),\n" +
            "\n" +
            "  ('11,'Vivo','bs'),\n" +
            "\n" +
            "  ('15,'Sercomtel','bs'),\n" +
            "\n" +
            "  ('23,'Vivo','bs'),\n" +
            "\n" +
            "  ('31,'Oi','bs'),\n" +
            "\n" +
            "  ('32,'CTBC Celular','bs'),\n" +
            "\n" +
            "  ('33,'CTBC Celular','bs'),\n" +
            "\n" +
            "  ('34,'CTBC Celular','bs'),\n" +
            "\n" +
            "  ('170,'LIME','bs'),\n" +
            "\n" +
            "  ('570,'CCT Boatphone','bs'),\n" +
            "\n" +
            "  ('770,'Digicel','bs'),\n" +
            "\n" +
            "  ('2,'B-Mobile','bs'),\n" +
            "\n" +
            "  ('11,'DSTCom','bs'),\n" +
            "\n" +
            "  ('1,'M-Tel','bs'),\n" +
            "\n" +
            "  ('3,'Vivacom','bs'),\n" +
            "\n" +
            "  ('5,'Telenor','bs'),\n" +
            "\n" +
            "  ('7,'????','bs'),\n" +
            "\n" +
            "  ('13,'MAX','bs'),\n" +
            "\n" +
            "  ('1,'Telmob','bs'),\n" +
            "\n" +
            "  ('2,'Airtel','bs'),\n" +
            "\n" +
            "  ('3,'Telecel Faso','bs'),\n" +
            "\n" +
            "  ('1,'Spacetel','bs'),\n" +
            "\n" +
            "  ('2,'Tempo','bs'),\n" +
            "\n" +
            "  ('3,'Onatel','bs'),\n" +
            "\n" +
            "  ('7,'Smart Mobile','bs'),\n" +
            "\n" +
            "  ('82,'Leo','bs'),\n" +
            "\n" +
            "  ('1,'Cellcard ( Mobitel )','kh'),\n" +
            "\n" +
            "  ('2,'Smart Axiata','kh'),\n" +
            "\n" +
            "  ('3,'qb','kh'),\n" +
            "\n" +
            "  ('4,'qb','kh'),\n" +
            "\n" +
            "  ('5,'Smart Axiata','kh'),\n" +
            "\n" +
            "  ('6,'Smart Axiata','kh'),\n" +
            "\n" +
            "  ('8,'Metfone','kh'),\n" +
            "\n" +
            "  ('9,'Beeline','kh'),\n" +
            "\n" +
            "  ('11,'Excell','kh'),\n" +
            "\n" +
            "  ('18,'Cellcard','kh'),\n" +
            "\n" +
            "  ('1,'MTN Cameroon','kh'),\n" +
            "\n" +
            "  ('2,'Orange','kh'),\n" +
            "\n" +
            "  ('4,'Nexttel','kh'),\n" +
            "\n" +
            "  ('270,'EastLink','kh'),\n" +
            "\n" +
            "  ('290,'Airtel Wireless','kh'),\n" +
            "\n" +
            "  ('320,'Mobilicity','kh'),\n" +
            "\n" +
            "  ('340,'Execulink','kh'),\n" +
            "\n" +
            "  ('360,'MiKe','kh'),\n" +
            "\n" +
            "  ('361,'Telus','kh'),\n" +
            "\n" +
            "  ('370,'Fido','kh'),\n" +
            "\n" +
            "  ('380,'Keewaytinook Mobile','kh'),\n" +
            "\n" +
            "  ('490,'Wind Mobile','kh'),\n" +
            "\n" +
            "  ('500,'Videotron','kh'),\n" +
            "\n" +
            "  ('510,'Videotron','kh'),\n" +
            "\n" +
            "  ('530,'Keewaytinook Mobile','kh'),\n" +
            "\n" +
            "  ('560,'Lynx Mobility','kh'),\n" +
            "\n" +
            "  ('590,'Quadro Mobility','kh'),\n" +
            "\n" +
            "  ('620,'ICE Wireless','kh'),\n" +
            "\n" +
            "  ('640,'Bell','kh'),\n" +
            "\n" +
            "  ('653,'Telus','kh'),\n" +
            "\n" +
            "  ('655,'MTS','kh'),\n" +
            "\n" +
            "  ('656,'TBay','kh'),\n" +
            "\n" +
            "  ('657,'Telus','kh'),\n" +
            "\n" +
            "  ('660,'MTS','kh'),\n" +
            "\n" +
            "  ('680,'SaskTel','kh'),\n" +
            "\n" +
            "  ('690,'Bell','kh'),\n" +
            "\n" +
            "  ('710,'Globalstar','kh'),\n" +
            "\n" +
            "  ('720,'Rogers Wireless','kh'),\n" +
            "\n" +
            "  ('760,'Public Mobile','kh'),\n" +
            "\n" +
            "  ('780,'SaskTel','kh'),\n" +
            "\n" +
            "  ('940,'Wightman Mobility','kh'),\n" +
            "\n" +
            "  ('140,'LIME','kh'),\n" +
            "\n" +
            "  ('50,'Digicel','kh'),\n" +
            "\n" +
            "  ('1,'CTP','kh'),\n" +
            "\n" +
            "  ('2,'TC','kh'),\n" +
            "\n" +
            "  ('3,'Orange','kh'),\n" +
            "\n" +
            "  ('4,'Nationlink','kh'),\n" +
            "\n" +
            "  ('1,'Airtel','kh'),\n" +
            "\n" +
            "  ('2,'Tawali','kh'),\n" +
            "\n" +
            "  ('3,'Tigo','kh'),\n" +
            "\n" +
            "  ('7,'Salam','kh'),\n" +
            "\n" +
            "  ('1,'entel','kh'),\n" +
            "\n" +
            "  ('2,'movistar','kh'),\n" +
            "\n" +
            "  ('3,'Claro','kh'),\n" +
            "\n" +
            "  ('4,'WOM','kh'),\n" +
            "\n" +
            "  ('6,'Telef�nica del Sur','kh'),\n" +
            "\n" +
            "  ('8,'VTR M�vil','kh'),\n" +
            "\n" +
            "  ('9,'WOM','kh'),\n" +
            "\n" +
            "  ('10,'entel','kh'),\n" +
            "\n" +
            "  ('12,'Colo-Colo M�vil Wanderers M�vil','kh'),\n" +
            "\n" +
            "  ('13,'Virgin Mobile','kh'),\n" +
            "\n" +
            "  ('99,'Will','kh'),\n" +
            "\n" +
            "  ('0,'China Mobile','kh'),\n" +
            "\n" +
            "  ('1,'China Unicom','kh'),\n" +
            "\n" +
            "  ('3,'China Telecom','kh'),\n" +
            "\n" +
            "  ('20,'China Tietong','kh'),\n" +
            "\n" +
            "  ('1,'movistar','kh'),\n" +
            "\n" +
            "  ('2,'Edatel','kh'),\n" +
            "\n" +
            "  ('20,'Une-EPM','kh'),\n" +
            "\n" +
            "  ('99,'EMCALI','kh'),\n" +
            "\n" +
            "  ('101,'Claro','kh'),\n" +
            "\n" +
            "  ('103,'Tigo','kh'),\n" +
            "\n" +
            "  ('111,'Tigo','kh'),\n" +
            "\n" +
            "  ('123,'movistar','kh'),\n" +
            "\n" +
            "  ('130,'AVANTEL','kh'),\n" +
            "\n" +
            "  ('1,'Comoros Telecom','kh'),\n" +
            "\n" +
            "  ('1,'Airtel','kh'),\n" +
            "\n" +
            "  ('10,'Libertis Telecom','kh'),\n" +
            "\n" +
            "  ('1,'Kokanet','kh'),\n" +
            "\n" +
            "  ('1,'Kolbi ICE','kh'),\n" +
            "\n" +
            "  ('2,'Kolbi ICE','kh'),\n" +
            "\n" +
            "  ('3,'Claro','kh'),\n" +
            "\n" +
            "  ('4,'movistar','kh'),\n" +
            "\n" +
            "  ('20,'fullm�vil','kh'),\n" +
            "\n" +
            "  ('1,'T-Mobile','kh'),\n" +
            "\n" +
            "  ('2,'Tele2','kh'),\n" +
            "\n" +
            "  ('10,'Vip','kh'),\n" +
            "\n" +
            "  ('1,'Cytamobile-Vodafone','kh'),\n" +
            "\n" +
            "  ('10,'MTN','kh'),\n" +
            "\n" +
            "  ('20,'PrimeTel','kh'),\n" +
            "\n" +
            "  ('22,'lemontel','kh'),\n" +
            "\n" +
            "  ('1,'T-Mobile','kh'),\n" +
            "\n" +
            "  ('2,'O2','kh'),\n" +
            "\n" +
            "  ('3,'Vodafone','kh'),\n" +
            "\n" +
            "  ('4,'U:fon','kh'),\n" +
            "\n" +
            "  ('99,'Vodafone','kh'),\n" +
            "\n" +
            "  ('1,'Vodacom','cd'),\n" +
            "\n" +
            "  ('2,'airtel','cd'),\n" +
            "\n" +
            "  ('5,'Supercell','cd'),\n" +
            "\n" +
            "  ('10,'Libertis Telecom','cd'),\n" +
            "\n" +
            "  ('86,'Orange','cd'),\n" +
            "\n" +
            "  ('89,'Tigo','cd'),\n" +
            "\n" +
            "  ('90,'Africell','cd'),\n" +
            "\n" +
            "  ('1,'TDC','cd'),\n" +
            "\n" +
            "  ('2,'Telenor','cd'),\n" +
            "\n" +
            "  ('5,'TetraNet','cd'),\n" +
            "\n" +
            "  ('6,'3','cd'),\n" +
            "\n" +
            "  ('7,'Vectone Mobile','cd'),\n" +
            "\n" +
            "  ('8,'Voxbone','cd'),\n" +
            "\n" +
            "  ('9,'SINE','cd'),\n" +
            "\n" +
            "  ('10,'TDC','cd'),\n" +
            "\n" +
            "  ('11,'SINE','cd'),\n" +
            "\n" +
            "  ('12,'Lycamobile','cd'),\n" +
            "\n" +
            "  ('20,'Telia','cd'),\n" +
            "\n" +
            "  ('23,'GSM-R DK','cd'),\n" +
            "\n" +
            "  ('77,'Telenor','cd'),\n" +
            "\n" +
            "  ('1,'Evatis','cd'),\n" +
            "\n" +
            "  ('20,'Digicel','cd'),\n" +
            "\n" +
            "  ('110,'LIME','cd'),\n" +
            "\n" +
            "  ('1,'Orange','cd'),\n" +
            "\n" +
            "  ('2,'Claro','cd'),\n" +
            "\n" +
            "  ('1,'Telkomcel','tl'),\n" +
            "\n" +
            "  ('2,'TT','tl'),\n" +
            "\n" +
            "  ('3,'Telemor','tl'),\n" +
            "\n" +
            "  ('0,'Movistar','tl'),\n" +
            "\n" +
            "  ('1,'Claro','tl'),\n" +
            "\n" +
            "  ('2,'CNT Mobile','tl'),\n" +
            "\n" +
            "  ('1,'Mobinil','tl'),\n" +
            "\n" +
            "  ('2,'Vodafone','tl'),\n" +
            "\n" +
            "  ('3,'Etisalat','tl'),\n" +
            "\n" +
            "  ('2,'digicel','tl'),\n" +
            "\n" +
            "  ('3,'Tigo','tl'),\n" +
            "\n" +
            "  ('4,'movistar','tl'),\n" +
            "\n" +
            "  ('1,'Orange GQ','tl'),\n" +
            "\n" +
            "  ('3,'Hits GQ','tl'),\n" +
            "\n" +
            "  ('1,'Eritel','tl'),\n" +
            "\n" +
            "  ('1,'EMT','tl'),\n" +
            "\n" +
            "  ('2,'Elisa','tl'),\n" +
            "\n" +
            "  ('3,'Tele 2','tl'),\n" +
            "\n" +
            "  ('8,'VIVEX','tl'),\n" +
            "\n" +
            "  ('1,'ETH-MTN','tl'),\n" +
            "\n" +
            "  ('1,'sure','fk'),\n" +
            "\n" +
            "  ('1,'Faroese Telecom','fk'),\n" +
            "\n" +
            "  ('2,'Vodafone','fk'),\n" +
            "\n" +
            "  ('1,'Vodafone','fk'),\n" +
            "\n" +
            "  ('2,'Digicel','fk'),\n" +
            "\n" +
            "  ('3,'DNA','fk'),\n" +
            "\n" +
            "  ('4,'AINA','fk'),\n" +
            "\n" +
            "  ('5,'Elisa','fk'),\n" +
            "\n" +
            "  ('11,'Vectone Mobile','fk'),\n" +
            "\n" +
            "  ('12,'DNA','fk'),\n" +
            "\n" +
            "  ('14,'�lcom','fk'),\n" +
            "\n" +
            "  ('17,'RHK','fk'),\n" +
            "\n" +
            "  ('21,'Elisa- Saunalahti','fk'),\n" +
            "\n" +
            "  ('26,'Compatel','fk'),\n" +
            "\n" +
            "  ('30,'Vectone Mobile','fk'),\n" +
            "\n" +
            "  ('31,'Kuiri','fk'),\n" +
            "\n" +
            "  ('32,'Voxbone','fk'),\n" +
            "\n" +
            "  ('33,'VIRVE','fk'),\n" +
            "\n" +
            "  ('34,'Elektrobit Wireless','fk'),\n" +
            "\n" +
            "  ('35,'Ukko Mobile','fk'),\n" +
            "\n" +
            "  ('91,'Sonera','fk'),\n" +
            "\n" +
            "  ('1,'Orange','fk'),\n" +
            "\n" +
            "  ('2,'Orange','fk'),\n" +
            "\n" +
            "  ('3,'MobiquiThings','fk'),\n" +
            "\n" +
            "  ('4,'Sisteer','fk'),\n" +
            "\n" +
            "  ('8,'Completel Mobile','fk'),\n" +
            "\n" +
            "  ('9,'SFR','fk'),\n" +
            "\n" +
            "  ('10,'SFR','fk'),\n" +
            "\n" +
            "  ('11,'SFR','fk'),\n" +
            "\n" +
            "  ('13,'SFR','fk'),\n" +
            "\n" +
            "  ('14,'RFF','fk'),\n" +
            "\n" +
            "  ('15,'Free Mobile','fk'),\n" +
            "\n" +
            "  ('16,'Free Mobile','fk'),\n" +
            "\n" +
            "  ('18,'Voxbone','fk'),\n" +
            "\n" +
            "  ('20,'Bouygues','fk'),\n" +
            "\n" +
            "  ('24,'MobiquiThings','fk'),\n" +
            "\n" +
            "  ('25,'LycaMobile','fk'),\n" +
            "\n" +
            "  ('26,'NRJ Mobile','fk'),\n" +
            "\n" +
            "  ('31,'Vectone Mobile','fk'),\n" +
            "\n" +
            "  ('88,'Bouygues','fk'),\n" +
            "\n" +
            "  ('92,'Com4Innov','fk'),\n" +
            "\n" +
            "  ('1,'Orange','fk'),\n" +
            "\n" +
            "  ('2,'Only','fk'),\n" +
            "\n" +
            "  ('3,'Chippie','fk'),\n" +
            "\n" +
            "  ('8,'Dauphin','fk'),\n" +
            "\n" +
            "  ('20,'Digicel','fk'),\n" +
            "\n" +
            "  ('15,'Vodafone','fk'),\n" +
            "\n" +
            "  ('20,'Vini','fk'),\n" +
            "\n" +
            "  ('1,'Libertis','ga'),\n" +
            "\n" +
            "  ('2,'Moov','ga'),\n" +
            "\n" +
            "  ('3,'Airtel','ga'),\n" +
            "\n" +
            "  ('4,'Azur','ga'),\n" +
            "\n" +
            "  ('1,'Gamcel','ga'),\n" +
            "\n" +
            "  ('2,'Africel','ga'),\n" +
            "\n" +
            "  ('3,'Comium','ga'),\n" +
            "\n" +
            "  ('4,'QCell','ga'),\n" +
            "\n" +
            "  ('1,'Geocell','ga'),\n" +
            "\n" +
            "  ('2,'MagtiCom','ga'),\n" +
            "\n" +
            "  ('3,'MagtiCom','ga'),\n" +
            "\n" +
            "  ('4,'Beeline','ga'),\n" +
            "\n" +
            "  ('5,'Silknet','ga'),\n" +
            "\n" +
            "  ('7,'GlobalCell','ga'),\n" +
            "\n" +
            "  ('8,'Silk LTE','ga'),\n" +
            "\n" +
            "  ('1,'Telekom','ga'),\n" +
            "\n" +
            "  ('2,'Vodafone','ga'),\n" +
            "\n" +
            "  ('3,'E-Plus','ga'),\n" +
            "\n" +
            "  ('7,'O2','ga'),\n" +
            "\n" +
            "  ('9,'Vodafone','ga'),\n" +
            "\n" +
            "  ('12,'Dolphin Telecom','ga'),\n" +
            "\n" +
            "  ('15,'Airdata','ga'),\n" +
            "\n" +
            "  ('20,'OnePhone','ga'),\n" +
            "\n" +
            "  ('33,'simquadrat','ga'),\n" +
            "\n" +
            "  ('43,'LYCA','ga'),\n" +
            "\n" +
            "  ('77,'E-Plus','ga'),\n" +
            "\n" +
            "  ('901,'Debitel','ga'),\n" +
            "\n" +
            "  ('1,'MTN','ga'),\n" +
            "\n" +
            "  ('2,'Vodafone','ga'),\n" +
            "\n" +
            "  ('3,'tiGO','ga'),\n" +
            "\n" +
            "  ('4,'Expresso','ga'),\n" +
            "\n" +
            "  ('6,'Airtel','ga'),\n" +
            "\n" +
            "  ('7,'Globacom','ga'),\n" +
            "\n" +
            "  ('8,'Surfline','ga'),\n" +
            "\n" +
            "  ('10,'Blu','ga'),\n" +
            "\n" +
            "  ('1,'GibTel','ga'),\n" +
            "\n" +
            "  ('9,'Shine','ga'),\n" +
            "\n" +
            "  ('1,'Cosmote','ga'),\n" +
            "\n" +
            "  ('2,'Cosmote','ga'),\n" +
            "\n" +
            "  ('5,'Vodafone','ga'),\n" +
            "\n" +
            "  ('9,'Wind','ga'),\n" +
            "\n" +
            "  ('10,'Wind','ga'),\n" +
            "\n" +
            "  ('14,'Cyta Hellas','ga'),\n" +
            "\n" +
            "  ('30,'Digicel','ga'),\n" +
            "\n" +
            "  ('110,'Cable & Wireless','ga'),\n" +
            "\n" +
            "  ('370,'Docomo','ga'),\n" +
            "\n" +
            "  ('250,'iConnect','ga'),\n" +
            "\n" +
            "  ('2,'Tigo','ga'),\n" +
            "\n" +
            "  ('3,'movistar','ga'),\n" +
            "\n" +
            "  ('�?,'RED/INTELFON','ga'),\n" +
            "\n" +
            "  ('3,'Airtel-Vodafone','ga'),\n" +
            "\n" +
            "  ('50,'JT','ga'),\n" +
            "\n" +
            "  ('55,'Sure Mobile','ga'),\n" +
            "\n" +
            "  ('1,'Orange S.A.','ga'),\n" +
            "\n" +
            "  ('2,'Sotelgui','ga'),\n" +
            "\n" +
            "  ('3,'Telecel Guinee','ga'),\n" +
            "\n" +
            "  ('4,'MTN','ga'),\n" +
            "\n" +
            "  ('5,'Cellcom','ga'),\n" +
            "\n" +
            "  ('1,'Guinetel','ga'),\n" +
            "\n" +
            "  ('2,'MTN Areeba','ga'),\n" +
            "\n" +
            "  ('3,'Orange','ga'),\n" +
            "\n" +
            "  ('7,'Guinetel','ga'),\n" +
            "\n" +
            "  ('1,'Digicel','ga'),\n" +
            "\n" +
            "  ('2,'GT&T Cellink Plus','ga'),\n" +
            "\n" +
            "  ('1,'Voila','ht'),\n" +
            "\n" +
            "  ('2,'Digicel','ht'),\n" +
            "\n" +
            "  ('3,'Natcom','ht'),\n" +
            "\n" +
            "  ('1,'Claro','ht'),\n" +
            "\n" +
            "  ('2,'Tigo','ht'),\n" +
            "\n" +
            "  ('30,'Hondutel','ht'),\n" +
            "\n" +
            "  ('40,'Digicel','ht'),\n" +
            "\n" +
            "  ('0,'1O1O / One2Free / New World Mobility / SUNMobile','ht'),\n" +
            "\n" +
            "  ('3,'3','ht'),\n" +
            "\n" +
            "  ('4,'3 (2G)','ht'),\n" +
            "\n" +
            "  ('6,'SmarTone','ht'),\n" +
            "\n" +
            "  ('8,'Truphone','ht'),\n" +
            "\n" +
            "  ('12,'CMCC HK','ht'),\n" +
            "\n" +
            "  ('13,'CMCC HK','ht'),\n" +
            "\n" +
            "  ('16,'PCCW Mobile (2G)','ht'),\n" +
            "\n" +
            "  ('19,'PCCW Mobile (3G/4G)','ht'),\n" +
            "\n" +
            "  ('29,'PCCW Mobile (CDMA)','ht'),\n" +
            "\n" +
            "  ('1,'Telenor','ht'),\n" +
            "\n" +
            "  ('30,'T-Mobile','ht'),\n" +
            "\n" +
            "  ('70,'Vodafone','ht'),\n" +
            "\n" +
            "  ('71,'UPC Hungary','ht'),\n" +
            "\n" +
            "  ('1,'S�minn','is'),\n" +
            "\n" +
            "  ('2,'Vodafone','is'),\n" +
            "\n" +
            "  ('3,'Vodafone','is'),\n" +
            "\n" +
            "  ('4,'Viking','is'),\n" +
            "\n" +
            "  ('8,'On-waves','is'),\n" +
            "\n" +
            "  ('11,'Nova','is'),\n" +
            "\n" +
            "  ('12,'Tal','is'),\n" +
            "\n" +
            "  ('1,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('2,'AirTel','is'),\n" +
            "\n" +
            "  ('3,'AirTel','is'),\n" +
            "\n" +
            "  ('4,'IDEA','is'),\n" +
            "\n" +
            "  ('5,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('7,'IDEA','is'),\n" +
            "\n" +
            "  ('9,'Reliance','is'),\n" +
            "\n" +
            "  ('10,'AirTel','is'),\n" +
            "\n" +
            "  ('11,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('12,'IDEA','is'),\n" +
            "\n" +
            "  ('13,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('14,'IDEA','is'),\n" +
            "\n" +
            "  ('15,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('16,'Airtel','is'),\n" +
            "\n" +
            "  ('17,'AIRCEL','is'),\n" +
            "\n" +
            "  ('18,'Reliance','is'),\n" +
            "\n" +
            "  ('19,'IDEA','is'),\n" +
            "\n" +
            "  ('20,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('21,'Loop Mobile','is'),\n" +
            "\n" +
            "  ('22,'IDEA','is'),\n" +
            "\n" +
            "  ('24,'IDEA','is'),\n" +
            "\n" +
            "  ('25,'AIRCEL','is'),\n" +
            "\n" +
            "  ('27,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('28,'AIRCEL','is'),\n" +
            "\n" +
            "  ('29,'AIRCEL','is'),\n" +
            "\n" +
            "  ('30,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('31,'AirTel','is'),\n" +
            "\n" +
            "  ('34,'CellOne','is'),\n" +
            "\n" +
            "  ('36,'Reliance','is'),\n" +
            "\n" +
            "  ('37,'Aircel','is'),\n" +
            "\n" +
            "  ('38,'CellOne','is'),\n" +
            "\n" +
            "  ('40,'AirTel','is'),\n" +
            "\n" +
            "  ('41,'Aircel','is'),\n" +
            "\n" +
            "  ('42,'Aircel','is'),\n" +
            "\n" +
            "  ('43,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('44,'IDEA','is'),\n" +
            "\n" +
            "  ('45,'Airtel','is'),\n" +
            "\n" +
            "  ('46,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('48,'Dishnet Wireless','is'),\n" +
            "\n" +
            "  ('49,'Airtel','is'),\n" +
            "\n" +
            "  ('50,'Reliance','is'),\n" +
            "\n" +
            "  ('51,'CellOne','is'),\n" +
            "\n" +
            "  ('52,'Reliance','is'),\n" +
            "\n" +
            "  ('53,'CellOne','is'),\n" +
            "\n" +
            "  ('54,'CellOne','is'),\n" +
            "\n" +
            "  ('55,'CellOne','is'),\n" +
            "\n" +
            "  ('56,'IDEA','is'),\n" +
            "\n" +
            "  ('57,'CellOne','is'),\n" +
            "\n" +
            "  ('58,'CellOne','is'),\n" +
            "\n" +
            "  ('59,'CellOne','is'),\n" +
            "\n" +
            "  ('60,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('62,'CellOne','is'),\n" +
            "\n" +
            "  ('64,'CellOne','is'),\n" +
            "\n" +
            "  ('66,'CellOne','is'),\n" +
            "\n" +
            "  ('67,'Reliance','is'),\n" +
            "\n" +
            "  ('68,'DOLPHIN','is'),\n" +
            "\n" +
            "  ('69,'DOLPHIN','is'),\n" +
            "\n" +
            "  ('70,'AirTel','is'),\n" +
            "\n" +
            "  ('71,'CellOne','is'),\n" +
            "\n" +
            "  ('72,'CellOne','is'),\n" +
            "\n" +
            "  ('73,'CellOne','is'),\n" +
            "\n" +
            "  ('74,'CellOne','is'),\n" +
            "\n" +
            "  ('75,'CellOne','is'),\n" +
            "\n" +
            "  ('76,'CellOne','is'),\n" +
            "\n" +
            "  ('77,'CellOne','is'),\n" +
            "\n" +
            "  ('78,'Idea Cellular Ltd','is'),\n" +
            "\n" +
            "  ('79,'CellOne','is'),\n" +
            "\n" +
            "  ('80,'CellOne','is'),\n" +
            "\n" +
            "  ('81,'CellOne','is'),\n" +
            "\n" +
            "  ('82,'Idea','is'),\n" +
            "\n" +
            "  ('83,'Reliance','is'),\n" +
            "\n" +
            "  ('84,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('85,'Reliance','is'),\n" +
            "\n" +
            "  ('86,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('87,'IDEA','is'),\n" +
            "\n" +
            "  ('88,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('89,'Idea','is'),\n" +
            "\n" +
            "  ('90,'AirTel','is'),\n" +
            "\n" +
            "  ('91,'AIRCEL','is'),\n" +
            "\n" +
            "  ('92,'AirTel','is'),\n" +
            "\n" +
            "  ('93,'AirTel','is'),\n" +
            "\n" +
            "  ('94,'AirTel','is'),\n" +
            "\n" +
            "  ('95,'AirTel','is'),\n" +
            "\n" +
            "  ('96,'AirTel','is'),\n" +
            "\n" +
            "  ('97,'AirTel','is'),\n" +
            "\n" +
            "  ('98,'AirTel','is'),\n" +
            "\n" +
            "  ('1,'Reliance','is'),\n" +
            "\n" +
            "  ('25,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('26,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('27,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('28,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('29,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('3,'Reliance','is'),\n" +
            "\n" +
            "  ('30,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('31,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('32,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('33,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('34,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('35,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('36,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('37,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('38,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('39,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('4,'Reliance','is'),\n" +
            "\n" +
            "  ('41,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('42,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('43,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('44,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('45,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('46,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('47,'TATA DOCOMO','is'),\n" +
            "\n" +
            "  ('5,'Reliance','is'),\n" +
            "\n" +
            "  ('6,'Reliance','is'),\n" +
            "\n" +
            "  ('7,'Reliance','is'),\n" +
            "\n" +
            "  ('8,'Reliance','is'),\n" +
            "\n" +
            "  ('9,'Reliance','is'),\n" +
            "\n" +
            "  ('10,'Reliance','is'),\n" +
            "\n" +
            "  ('11,'Reliance','is'),\n" +
            "\n" +
            "  ('12,'Reliance','is'),\n" +
            "\n" +
            "  ('13,'Reliance','is'),\n" +
            "\n" +
            "  ('14,'Reliance','is'),\n" +
            "\n" +
            "  ('15,'Reliance','is'),\n" +
            "\n" +
            "  ('17,'Reliance','is'),\n" +
            "\n" +
            "  ('18,'Reliance','is'),\n" +
            "\n" +
            "  ('19,'Reliance','is'),\n" +
            "\n" +
            "  ('20,'Reliance','is'),\n" +
            "\n" +
            "  ('21,'Reliance','is'),\n" +
            "\n" +
            "  ('22,'Reliance','is'),\n" +
            "\n" +
            "  ('23,'Reliance','is'),\n" +
            "\n" +
            "  ('51,'AirTel','is'),\n" +
            "\n" +
            "  ('52,'AirTel','is'),\n" +
            "\n" +
            "  ('53,'AirTel','is'),\n" +
            "\n" +
            "  ('54,'AirTel','is'),\n" +
            "\n" +
            "  ('55,'Airtel','is'),\n" +
            "\n" +
            "  ('56,'AirTel','is'),\n" +
            "\n" +
            "  ('66,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('67,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('70,'IDEA','is'),\n" +
            "\n" +
            "  ('750,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('751,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('752,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('753,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('754,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('755,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('756,'Vodafone IN','is'),\n" +
            "\n" +
            "  ('799,'IDEA','is'),\n" +
            "\n" +
            "  ('800,'AIRCEL','is'),\n" +
            "\n" +
            "  ('801,'AIRCEL','is'),\n" +
            "\n" +
            "  ('803,'AIRCEL','is'),\n" +
            "\n" +
            "  ('804,'AIRCEL','is'),\n" +
            "\n" +
            "  ('805,'AIRCEL','is'),\n" +
            "\n" +
            "  ('806,'AIRCEL','is'),\n" +
            "\n" +
            "  ('809,'AIRCEL','is'),\n" +
            "\n" +
            "  ('810,'AIRCEL','is'),\n" +
            "\n" +
            "  ('811,'AIRCEL','is'),\n" +
            "\n" +
            "  ('819,'Uninor','is'),\n" +
            "\n" +
            "  ('818,'Uninor','is'),\n" +
            "\n" +
            "  ('820,'Uninor','is'),\n" +
            "\n" +
            "  ('821,'Uninor','is'),\n" +
            "\n" +
            "  ('822,'Uninor','is'),\n" +
            "\n" +
            "  ('827,'Videocon Datacom','is'),\n" +
            "\n" +
            "  ('845,'IDEA','is'),\n" +
            "\n" +
            "  ('846,'IDEA','is'),\n" +
            "\n" +
            "  ('847,'IDEA','is'),\n" +
            "\n" +
            "  ('848,'IDEA','is'),\n" +
            "\n" +
            "  ('849,'IDEA','is'),\n" +
            "\n" +
            "  ('850,'IDEA','is'),\n" +
            "\n" +
            "  ('851,'IDEA','is'),\n" +
            "\n" +
            "  ('852,'IDEA','is'),\n" +
            "\n" +
            "  ('853,'IDEA','is'),\n" +
            "\n" +
            "  ('880,'Uninor','is'),\n" +
            "\n" +
            "  ('908,'IDEA','is'),\n" +
            "\n" +
            "  ('909,'IDEA','is'),\n" +
            "\n" +
            "  ('910,'IDEA','is'),\n" +
            "\n" +
            "  ('911,'IDEA','is'),\n" +
            "\n" +
            "  ('927,'Uninor','is'),\n" +
            "\n" +
            "  ('929,'Uninor','is'),\n" +
            "\n" +
            "  ('0,'PSN','is'),\n" +
            "\n" +
            "  ('1,'INDOSAT','is'),\n" +
            "\n" +
            "  ('7,'TelkomFlexi','is'),\n" +
            "\n" +
            "  ('8,'AXIS','is'),\n" +
            "\n" +
            "  ('9,'Smartfren','is'),\n" +
            "\n" +
            "  ('10,'Telkomsel','is'),\n" +
            "\n" +
            "  ('11,'XL','is'),\n" +
            "\n" +
            "  ('27,'Ceria','is'),\n" +
            "\n" +
            "  ('28,'Fren/Hepi','is'),\n" +
            "\n" +
            "  ('88,'BOLT! Super 4G','is'),\n" +
            "\n" +
            "  ('89,'3','is'),\n" +
            "\n" +
            "  ('99,'Esia','is'),\n" +
            "\n" +
            "  ('11,'IR-MCI (Hamrahe Avval)','is'),\n" +
            "\n" +
            "  ('14,'TKC','is'),\n" +
            "\n" +
            "  ('19,'MTCE (Espadan)','is'),\n" +
            "\n" +
            "  ('20,'Rightel','is'),\n" +
            "\n" +
            "  ('32,'Taliya','is'),\n" +
            "\n" +
            "  ('35,'MTN Irancell','is'),\n" +
            "\n" +
            "  ('70,'TCI','is'),\n" +
            "\n" +
            "  ('93,'Iraphone','is'),\n" +
            "\n" +
            "  ('5,'Asia Cell','is'),\n" +
            "\n" +
            "  ('8,'SanaTel','is'),\n" +
            "\n" +
            "  ('20,'Zain','is'),\n" +
            "\n" +
            "  ('30,'Zain','is'),\n" +
            "\n" +
            "  ('40,'Korek','is'),\n" +
            "\n" +
            "  ('45,'Mobitel','is'),\n" +
            "\n" +
            "  ('62,'Itisaluna','is'),\n" +
            "\n" +
            "  ('92,'Omnnea','is'),\n" +
            "\n" +
            "  ('1,'Vodafone','is'),\n" +
            "\n" +
            "  ('2,'3','is'),\n" +
            "\n" +
            "  ('3,'Meteor','is'),\n" +
            "\n" +
            "  ('5,'3','is'),\n" +
            "\n" +
            "  ('7,'eMobile','is'),\n" +
            "\n" +
            "  ('11,'Tesco Mobile','is'),\n" +
            "\n" +
            "  ('13,'Lycamobile','is'),\n" +
            "\n" +
            "  ('15,'UPC Mobile','is'),\n" +
            "\n" +
            "  ('16,'Carphone Warehouse','is'),\n" +
            "\n" +
            "  ('36,'Sure Mobile','is'),\n" +
            "\n" +
            "  ('58,'Pronto GSM','is'),\n" +
            "\n" +
            "  ('1,'Orange','is'),\n" +
            "\n" +
            "  ('2,'Cellcom','is'),\n" +
            "\n" +
            "  ('3,'Pelephone','is'),\n" +
            "\n" +
            "  ('5,'Jawwal','is'),\n" +
            "\n" +
            "  ('6,'Wataniya Mobile','is'),\n" +
            "\n" +
            "  ('7,'Hot Mobile','is'),\n" +
            "\n" +
            "  ('8,'Golan Telecom','is'),\n" +
            "\n" +
            "  ('14,'Youphone','is'),\n" +
            "\n" +
            "  ('15,'Home Cellular','is'),\n" +
            "\n" +
            "  ('16,'Rami Levy','is'),\n" +
            "\n" +
            "  ('18,'Cellact Communications','is'),\n" +
            "\n" +
            "  ('19,'Telzar 019','is'),\n" +
            "\n" +
            "  ('24,'012 Telecom','is'),\n" +
            "\n" +
            "  ('1,'TIM','is'),\n" +
            "\n" +
            "  ('10,'Vodafone','is'),\n" +
            "\n" +
            "  ('30,'RFI','is'),\n" +
            "\n" +
            "  ('33,'Poste Mobile','is'),\n" +
            "\n" +
            "  ('35,'Lyca Italy','is'),\n" +
            "\n" +
            "  ('88,'Wind','is'),\n" +
            "\n" +
            "  ('99,'3 Italia','is'),\n" +
            "\n" +
            "  ('2,'Moov','is'),\n" +
            "\n" +
            "  ('3,'Orange','is'),\n" +
            "\n" +
            "  ('4,'KoZ','is'),\n" +
            "\n" +
            "  ('5,'MTN','is'),\n" +
            "\n" +
            "  ('6,'GreenN','is'),\n" +
            "\n" +
            "  ('7,'caf�','is'),\n" +
            "\n" +
            "  ('50,'Digicel','jm'),\n" +
            "\n" +
            "  ('110,'LIME','jm'),\n" +
            "\n" +
            "  ('180,'LIME','jm'),\n" +
            "\n" +
            "  ('0,'Y!Mobile','jm'),\n" +
            "\n" +
            "  ('1,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('2,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('3,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('4,'SoftBank','jm'),\n" +
            "\n" +
            "  ('6,'SoftBank','jm'),\n" +
            "\n" +
            "  ('7,'KDDI','jm'),\n" +
            "\n" +
            "  ('8,'KDDI','jm'),\n" +
            "\n" +
            "  ('9,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('10,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('11,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('12,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('13,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('14,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('15,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('16,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('17,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('18,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('19,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('20,'SoftBank','jm'),\n" +
            "\n" +
            "  ('21,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('22,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('23,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('24,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('25,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('26,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('27,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('28,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('29,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('30,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('31,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('32,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('33,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('34,'NTT docomo','jm'),\n" +
            "\n" +
            "  ('35,'NTT DoCoMo','jm'),\n" +
            "\n" +
            "  ('36,'NTT DoCoMo','jm'),\n" +
            "\n" +
            "  ('37,'NTT DoCoMo','jm'),\n" +
            "\n" +
            "  ('38,'NTT DoCoMo','jm'),\n" +
            "\n" +
            "  ('39,'NTT DoCoMo','jm'),\n" +
            "\n" +
            "  ('40,'SoftBank','jm'),\n" +
            "\n" +
            "  ('41,'SoftBank','jm'),\n" +
            "\n" +
            "  ('42,'SoftBank','jm'),\n" +
            "\n" +
            "  ('43,'SoftBank','jm'),\n" +
            "\n" +
            "  ('44,'SoftBank','jm'),\n" +
            "\n" +
            "  ('45,'SoftBank','jm'),\n" +
            "\n" +
            "  ('46,'SoftBank','jm'),\n" +
            "\n" +
            "  ('47,'SoftBank','jm'),\n" +
            "\n" +
            "  ('48,'SoftBank','jm'),\n" +
            "\n" +
            "  ('49,'NTT DoCoMo','jm'),\n" +
            "\n" +
            "  ('50,'KDDI','jm'),\n" +
            "\n" +
            "  ('51,'KDDI','jm'),\n" +
            "\n" +
            "  ('52,'KDDI','jm'),\n" +
            "\n" +
            "  ('53,'KDDI','jm'),\n" +
            "\n" +
            "  ('54,'KDDI','jm'),\n" +
            "\n" +
            "  ('55,'KDDI','jm'),\n" +
            "\n" +
            "  ('56,'KDDI','jm'),\n" +
            "\n" +
            "  ('58,'NTT DoCoMo','jm'),\n" +
            "\n" +
            "  ('60,'NTT DoCoMo','jm'),\n" +
            "\n" +
            "  ('61,'NTT DoCoMo','jm'),\n" +
            "\n" +
            "  ('62,'NTT DoCoMo','jm'),\n" +
            "\n" +
            "  ('63,'NTT DoCoMo','jm'),\n" +
            "\n" +
            "  ('64,'NTT DoCoMo','jm'),\n" +
            "\n" +
            "  ('65,'NTT DoCoMo','jm'),\n" +
            "\n" +
            "  ('66,'NTT DoCoMo','jm'),\n" +
            "\n" +
            "  ('67,'NTT DoCoMo','jm'),\n" +
            "\n" +
            "  ('68,'NTT DoCoMo','jm'),\n" +
            "\n" +
            "  ('69,'NTT DoCoMo','jm'),\n" +
            "\n" +
            "  ('70,'au','jm'),\n" +
            "\n" +
            "  ('71,'KDDI','jm'),\n" +
            "\n" +
            "  ('72,'KDDI','jm'),\n" +
            "\n" +
            "  ('73,'KDDI','jm'),\n" +
            "\n" +
            "  ('74,'KDDI','jm'),\n" +
            "\n" +
            "  ('75,'KDDI','jm'),\n" +
            "\n" +
            "  ('76,'KDDI','jm'),\n" +
            "\n" +
            "  ('77,'KDDI','jm'),\n" +
            "\n" +
            "  ('79,'KDDI','jm'),\n" +
            "\n" +
            "  ('87,'NTT DoCoMo','jm'),\n" +
            "\n" +
            "  ('88,'KDDI','jm'),\n" +
            "\n" +
            "  ('89,'KDDI','jm'),\n" +
            "\n" +
            "  ('90,'SoftBank','jm'),\n" +
            "\n" +
            "  ('92,'SoftBank','jm'),\n" +
            "\n" +
            "  ('93,'SoftBank','jm'),\n" +
            "\n" +
            "  ('94,'SoftBank','jm'),\n" +
            "\n" +
            "  ('95,'SoftBank','jm'),\n" +
            "\n" +
            "  ('96,'SoftBank','jm'),\n" +
            "\n" +
            "  ('97,'SoftBank','jm'),\n" +
            "\n" +
            "  ('98,'SoftBank','jm'),\n" +
            "\n" +
            "  ('99,'NTT DoCoMo','jm'),\n" +
            "\n" +
            "  ('3,'Airtel Vodafone','jm'),\n" +
            "\n" +
            "  ('50,'JT','jm'),\n" +
            "\n" +
            "  ('55,'Sure Mobile','jm'),\n" +
            "\n" +
            "  ('1,'zain JO','jm'),\n" +
            "\n" +
            "  ('2,'XPress Telecom','jm'),\n" +
            "\n" +
            "  ('3,'Umniah','jm'),\n" +
            "\n" +
            "  ('77,'Orange','jm'),\n" +
            "\n" +
            "  ('1,'Beeline','kz'),\n" +
            "\n" +
            "  ('2,'Kcell','kz'),\n" +
            "\n" +
            "  ('7,'Altel','kz'),\n" +
            "\n" +
            "  ('8,'Kazakhtelecom','kz'),\n" +
            "\n" +
            "  ('77,'Tele2.kz','kz'),\n" +
            "\n" +
            "  ('2,'Safaricom','kz'),\n" +
            "\n" +
            "  ('3,'Airtel','kz'),\n" +
            "\n" +
            "  ('7,'Orange Kenya','kz'),\n" +
            "\n" +
            "  ('1,'Kiribati - TSKL','kz'),\n" +
            "\n" +
            "  ('9,'Kiribati - Frigate Net','kz'),\n" +
            "\n" +
            "  ('5,'Koryolink','kz'),\n" +
            "\n" +
            "  ('5,'SKTelecom','kz'),\n" +
            "\n" +
            "  ('6,'LG U+','kz'),\n" +
            "\n" +
            "  ('8,'olleh','kz'),\n" +
            "\n" +
            "  ('1,'Vala','kz'),\n" +
            "\n" +
            "  ('1,'Z Mobile','kz'),\n" +
            "\n" +
            "  ('41,'IPKO','kz'),\n" +
            "\n" +
            "  ('41,'D3 Mobile','kz'),\n" +
            "\n" +
            "  ('2,'zain KW','kz'),\n" +
            "\n" +
            "  ('3,'K.S.C Ooredoo','kz'),\n" +
            "\n" +
            "  ('4,'Viva','kz'),\n" +
            "\n" +
            "  ('1,'Beeline','kz'),\n" +
            "\n" +
            "  ('3,'Fonex','kz'),\n" +
            "\n" +
            "  ('5,'MegaCom','kz'),\n" +
            "\n" +
            "  ('9,'O!','kz'),\n" +
            "\n" +
            "  ('1,'LTC','la'),\n" +
            "\n" +
            "  ('2,'ETL','la'),\n" +
            "\n" +
            "  ('8,'Beeline','la'),\n" +
            "\n" +
            "  ('1,'LMT','la'),\n" +
            "\n" +
            "  ('2,'Tele2','la'),\n" +
            "\n" +
            "  ('3,'TRIATEL','la'),\n" +
            "\n" +
            "  ('5,'Bite','la'),\n" +
            "\n" +
            "  ('7,'MTS','la'),\n" +
            "\n" +
            "  ('8,'IZZI','la'),\n" +
            "\n" +
            "  ('9,'Camel Mobile','la'),\n" +
            "\n" +
            "  ('1,'Alfa','la'),\n" +
            "\n" +
            "  ('3,'mtc touch','la'),\n" +
            "\n" +
            "  ('5,'Ogero Mobile','la'),\n" +
            "\n" +
            "  ('1,'Vodacom','la'),\n" +
            "\n" +
            "  ('1,'Lonestar Cell','la'),\n" +
            "\n" +
            "  ('2,'Libercell','la'),\n" +
            "\n" +
            "  ('4,'Comium','la'),\n" +
            "\n" +
            "  ('20,'LIBTELCO','la'),\n" +
            "\n" +
            "  ('0,'Libyana','la'),\n" +
            "\n" +
            "  ('1,'Madar','la'),\n" +
            "\n" +
            "  ('2,'Al-Jeel Phone','la'),\n" +
            "\n" +
            "  ('3,'Libya Phone','la'),\n" +
            "\n" +
            "  ('6,'Hatef Libya','la'),\n" +
            "\n" +
            "  ('1,'Swisscom','la'),\n" +
            "\n" +
            "  ('2,'7acht','la'),\n" +
            "\n" +
            "  ('5,'FL1','la'),\n" +
            "\n" +
            "  ('6,'Cubic Telecom','la'),\n" +
            "\n" +
            "  ('1,'Omnitel','la'),\n" +
            "\n" +
            "  ('2,'BIT?','la'),\n" +
            "\n" +
            "  ('3,'Tele 2','la'),\n" +
            "\n" +
            "  ('5,'LitRail','la'),\n" +
            "\n" +
            "  ('6,'Mediafon','la'),\n" +
            "\n" +
            "  ('8,'MEZON','la'),\n" +
            "\n" +
            "  ('1,'POST','la'),\n" +
            "\n" +
            "  ('77,'Tango','la'),\n" +
            "\n" +
            "  ('99,'Orange','la'),\n" +
            "\n" +
            "  ('2,'China Telecom','mo'),\n" +
            "\n" +
            "  ('7,'China Telecom','mo'),\n" +
            "\n" +
            "  ('1,'Telekom.mk','mo'),\n" +
            "\n" +
            "  ('2,'ONE','mo'),\n" +
            "\n" +
            "  ('3,'Vip MK','mo'),\n" +
            "\n" +
            "  ('1,'Airtel','mo'),\n" +
            "\n" +
            "  ('2,'Orange','mo'),\n" +
            "\n" +
            "  ('4,'Telma','mo'),\n" +
            "\n" +
            "  ('1,'TNM','mo'),\n" +
            "\n" +
            "  ('10,'Airtel','mo'),\n" +
            "\n" +
            "  ('1,'ATUR 450','mo'),\n" +
            "\n" +
            "  ('11,'TM Homeline','mo'),\n" +
            "\n" +
            "  ('12,'Maxis','mo'),\n" +
            "\n" +
            "  ('13,'Celcom','mo'),\n" +
            "\n" +
            "  ('150,'Tune Talk','mo'),\n" +
            "\n" +
            "  ('152,'Yes','mo'),\n" +
            "\n" +
            "  ('156,'Altel','mo'),\n" +
            "\n" +
            "  ('16,'DiGi','mo'),\n" +
            "\n" +
            "  ('17,'Hotlink','mo'),\n" +
            "\n" +
            "  ('18,'U Mobile','mo'),\n" +
            "\n" +
            "  ('19,'Celcom','mo'),\n" +
            "\n" +
            "  ('1,'Dhiraagu','mo'),\n" +
            "\n" +
            "  ('2,'Ooredoo','mo'),\n" +
            "\n" +
            "  ('1,'Malitel','mo'),\n" +
            "\n" +
            "  ('2,'Orange','mo'),\n" +
            "\n" +
            "  ('1,'Vodafone','mo'),\n" +
            "\n" +
            "  ('21,'GO','mo'),\n" +
            "\n" +
            "  ('77,'Melita','mo'),\n" +
            "\n" +
            "  ('1,'Mattel','mo'),\n" +
            "\n" +
            "  ('2,'Chinguitel','mo'),\n" +
            "\n" +
            "  ('10,'Mauritel','mo'),\n" +
            "\n" +
            "  ('1,'Orange','mo'),\n" +
            "\n" +
            "  ('2,'MTML','mo'),\n" +
            "\n" +
            "  ('10,'Emtel','mo'),\n" +
            "\n" +
            "  ('10,'Nextel','mo'),\n" +
            "\n" +
            "  ('20,'Telcel','mo'),\n" +
            "\n" +
            "  ('30,'movistar','mo'),\n" +
            "\n" +
            "  ('40,'Iusacell / Unefon','mo'),\n" +
            "\n" +
            "  ('50,'Iusacell','mo'),\n" +
            "\n" +
            "  ('90,'Nextel','mo'),\n" +
            "\n" +
            "  ('1,'Orange','mo'),\n" +
            "\n" +
            "  ('2,'Moldcell','mo'),\n" +
            "\n" +
            "  ('3,'IDC','mo'),\n" +
            "\n" +
            "  ('3,'Unit�','mo'),\n" +
            "\n" +
            "  ('5,'Unit�','mo'),\n" +
            "\n" +
            "  ('99,'Unit�','mo'),\n" +
            "\n" +
            "  ('1,'Office des Telephones','mo'),\n" +
            "\n" +
            "  ('88,'Unitel','mo'),\n" +
            "\n" +
            "  ('91,'Skytel','mo'),\n" +
            "\n" +
            "  ('98,'G-Mobile','mo'),\n" +
            "\n" +
            "  ('99,'Mobicom','mo'),\n" +
            "\n" +
            "  ('1,'Telenor','mo'),\n" +
            "\n" +
            "  ('2,'T-Mobile','mo'),\n" +
            "\n" +
            "  ('3,'m:tel CG','mo'),\n" +
            "\n" +
            "  ('860,'Cable & Wireless','mo'),\n" +
            "\n" +
            "  ('0,'M�ditel','mo'),\n" +
            "\n" +
            "  ('1,'IAM','mo'),\n" +
            "\n" +
            "  ('2,'Wana Corporate','mo'),\n" +
            "\n" +
            "  ('5,'INWI (Telecommunications)','mo'),\n" +
            "\n" +
            "  ('1,'mCel','mo'),\n" +
            "\n" +
            "  ('3,'Movitel','mo'),\n" +
            "\n" +
            "  ('1,'MPT','mo'),\n" +
            "\n" +
            "  ('3,'CDMA800','mo'),\n" +
            "\n" +
            "  ('5,'Ooredoo','mo'),\n" +
            "\n" +
            "  ('6,'Telenor Myanmar','mo'),\n" +
            "\n" +
            "  ('1,'MTC','na'),\n" +
            "\n" +
            "  ('2,'switch','na'),\n" +
            "\n" +
            "  ('3,'TN Mobile','na'),\n" +
            "\n" +
            "  ('2,'Digicel','na'),\n" +
            "\n" +
            "  ('1,'Namaste / NT Mobile','na'),\n" +
            "\n" +
            "  ('2,'Ncell','na'),\n" +
            "\n" +
            "  ('3,'Sky/C-Phone','na'),\n" +
            "\n" +
            "  ('4,'SmartCell','na'),\n" +
            "\n" +
            "  ('2,'Tele2','na'),\n" +
            "\n" +
            "  ('3,'Voiceworks','na'),\n" +
            "\n" +
            "  ('4,'Vodafone','na'),\n" +
            "\n" +
            "  ('6,'Vectone Mobile / Delight Mobile','na'),\n" +
            "\n" +
            "  ('8,'KPN','na'),\n" +
            "\n" +
            "  ('9,'Lycamobile','na'),\n" +
            "\n" +
            "  ('10,'KPN','na'),\n" +
            "\n" +
            "  ('12,'Telfort','na'),\n" +
            "\n" +
            "  ('15,'Ziggo','na'),\n" +
            "\n" +
            "  ('16,'T-Mobile (BEN)','na'),\n" +
            "\n" +
            "  ('17,'Intercity Zakelijk','na'),\n" +
            "\n" +
            "  ('20,'T-Mobile','na'),\n" +
            "\n" +
            "  ('62,'Voxbone','na'),\n" +
            "\n" +
            "  ('51,'Telcell','na'),\n" +
            "\n" +
            "  ('54,'ECC','na'),\n" +
            "\n" +
            "  ('59,'Chippie','na'),\n" +
            "\n" +
            "  ('60,'Chippie','na'),\n" +
            "\n" +
            "  ('68,'Digicel','na'),\n" +
            "\n" +
            "  ('69,'Digicel','na'),\n" +
            "\n" +
            "  ('76,'Digicel','na'),\n" +
            "\n" +
            "  ('78,'Telbo','na'),\n" +
            "\n" +
            "  ('91,'Chippie','na'),\n" +
            "\n" +
            "  ('94,'Bay�s','na'),\n" +
            "\n" +
            "  ('1,'Mobilis','na'),\n" +
            "\n" +
            "  ('1,'Vodafone','na'),\n" +
            "\n" +
            "  ('3,'Woosh','na'),\n" +
            "\n" +
            "  ('5,'Spark NZ','na'),\n" +
            "\n" +
            "  ('6,'Skinny','na'),\n" +
            "\n" +
            "  ('24,'2degrees','na'),\n" +
            "\n" +
            "  ('73,'SERCOM','na'),\n" +
            "\n" +
            "  ('1,'SahelCom','na'),\n" +
            "\n" +
            "  ('2,'Airtel','na'),\n" +
            "\n" +
            "  ('3,'Moov','na'),\n" +
            "\n" +
            "  ('4,'Orange','na'),\n" +
            "\n" +
            "  ('20,'Airtel','na'),\n" +
            "\n" +
            "  ('25,'Visafone','na'),\n" +
            "\n" +
            "  ('27,'Smile','na'),\n" +
            "\n" +
            "  ('30,'MTN','na'),\n" +
            "\n" +
            "  ('50,'Glo','na'),\n" +
            "\n" +
            "  ('60,'Etisalat','na'),\n" +
            "\n" +
            "  ('1,'Telecom Niue','na'),\n" +
            "\n" +
            "  ('10,'Norfolk Telecom','na'),\n" +
            "\n" +
            "  ('110,'IT&E Wireless','na'),\n" +
            "\n" +
            "  ('370,'Docomo','na'),\n" +
            "\n" +
            "  ('1,'Telenor','na'),\n" +
            "\n" +
            "  ('2,'NetCom','na'),\n" +
            "\n" +
            "  ('4,'Tele2','na'),\n" +
            "\n" +
            "  ('5,'Network Norway','na'),\n" +
            "\n" +
            "  ('6,'ICE','na'),\n" +
            "\n" +
            "  ('7,'Phonero','na'),\n" +
            "\n" +
            "  ('8,'TDC','na'),\n" +
            "\n" +
            "  ('9,'Com4','na'),\n" +
            "\n" +
            "  ('23,'Lyca','na'),\n" +
            "\n" +
            "  ('2,'Omantel','om'),\n" +
            "\n" +
            "  ('3,'ooredoo','om'),\n" +
            "\n" +
            "  ('1,'Mobilink','pk'),\n" +
            "\n" +
            "  ('2,'PTCL','pk'),\n" +
            "\n" +
            "  ('3,'Ufone','pk'),\n" +
            "\n" +
            "  ('4,'Zong','pk'),\n" +
            "\n" +
            "  ('5,'SCO Mobile','pk'),\n" +
            "\n" +
            "  ('6,'Telenor','pk'),\n" +
            "\n" +
            "  ('7,'Warid Pakistan','pk'),\n" +
            "\n" +
            "  ('8,'SCO Mobile','pk'),\n" +
            "\n" +
            "  ('1,'PNCC','pk'),\n" +
            "\n" +
            "  ('80,'Palau Mobile','pk'),\n" +
            "\n" +
            "  ('6,'Wataniya','pk'),\n" +
            "\n" +
            "  ('1,'Cable & Wireless','pk'),\n" +
            "\n" +
            "  ('3,'Claro','pk'),\n" +
            "\n" +
            "  ('4,'Digicel','pk'),\n" +
            "\n" +
            "  ('1,'bmobile','pk'),\n" +
            "\n" +
            "  ('3,'Digicel','pk'),\n" +
            "\n" +
            "  ('1,'VOX','pk'),\n" +
            "\n" +
            "  ('2,'Claro/Hutchison','pk'),\n" +
            "\n" +
            "  ('4,'Tigo','pk'),\n" +
            "\n" +
            "  ('5,'Personal','pk'),\n" +
            "\n" +
            "  ('6,'Copaco','pk'),\n" +
            "\n" +
            "  ('6,'Movistar','pk'),\n" +
            "\n" +
            "  ('10,'Claro (TIM)','pk'),\n" +
            "\n" +
            "  ('15,'Viettel Mobile','pk'),\n" +
            "\n" +
            "  ('17,'NEXTEL','pk'),\n" +
            "\n" +
            "  ('2,'Globe','pk'),\n" +
            "\n" +
            "  ('3,'Smart','pk'),\n" +
            "\n" +
            "  ('5,'Sun','pk'),\n" +
            "\n" +
            "  ('18,'Cure','pk'),\n" +
            "\n" +
            "  ('24,'ABS-CBN','pk'),\n" +
            "\n" +
            "  ('1,'Plus','pk'),\n" +
            "\n" +
            "  ('2,'T-Mobile','pk'),\n" +
            "\n" +
            "  ('3,'Orange','pk'),\n" +
            "\n" +
            "  ('6,'Play','pk'),\n" +
            "\n" +
            "  ('7,'Netia','pk'),\n" +
            "\n" +
            "  ('9,'Lycamobile','pk'),\n" +
            "\n" +
            "  ('10,'Sferia','pk'),\n" +
            "\n" +
            "  ('11,'Nordisk Polska','pk'),\n" +
            "\n" +
            "  ('12,'Cyfrowy Polsat','pk'),\n" +
            "\n" +
            "  ('15,'Aero2','pk'),\n" +
            "\n" +
            "  ('16,'Mobyland','pk'),\n" +
            "\n" +
            "  ('17,'Aero2','pk'),\n" +
            "\n" +
            "  ('33,'Truphone','pk'),\n" +
            "\n" +
            "  ('34,'NetWorkS!','pk'),\n" +
            "\n" +
            "  ('36,'Vectone Mobile','pk'),\n" +
            "\n" +
            "  ('39,'Voxbone','pk'),\n" +
            "\n" +
            "  ('1,'Vodafone','pk'),\n" +
            "\n" +
            "  ('3,'NOS','pk'),\n" +
            "\n" +
            "  ('4,'LycaMobile','pk'),\n" +
            "\n" +
            "  ('6,'MEO','pk'),\n" +
            "\n" +
            "  ('7,'Vectone Mobile / Delight Mobile','pk'),\n" +
            "\n" +
            "  ('0,'Open Mobile','pk'),\n" +
            "\n" +
            "  ('110,'Claro Puerto Rico','pk'),\n" +
            "\n" +
            "  ('120,'tmobile','pk'),\n" +
            "\n" +
            "  ('1,'ooredoo','qa'),\n" +
            "\n" +
            "  ('2,'Vodafone','qa'),\n" +
            "\n" +
            "  ('5,'Ministry of Interior','qa'),\n" +
            "\n" +
            "  ('6,'Ministry of Interior','qa'),\n" +
            "\n" +
            "  ('0,'Orange','re'),\n" +
            "\n" +
            "  ('2,'Outremer','re'),\n" +
            "\n" +
            "  ('10,'SFR Reunion','re'),\n" +
            "\n" +
            "  ('1,'Vodafone','re'),\n" +
            "\n" +
            "  ('3,'Telekom','re'),\n" +
            "\n" +
            "  ('5,'Digi.Mobil','re'),\n" +
            "\n" +
            "  ('6,'Telekom/Zapp','re'),\n" +
            "\n" +
            "  ('10,'Orange','re'),\n" +
            "\n" +
            "  ('15,'Idilis','re'),\n" +
            "\n" +
            "  ('16,'Lycamobile','re'),\n" +
            "\n" +
            "  ('1,'MTS','re'),\n" +
            "\n" +
            "  ('2,'MegaFon','re'),\n" +
            "\n" +
            "  ('3,'NCC','re'),\n" +
            "\n" +
            "  ('5,'ETK','re'),\n" +
            "\n" +
            "  ('6,'Skylink','re'),\n" +
            "\n" +
            "  ('7,'SMARTS','re'),\n" +
            "\n" +
            "  ('9,'Skylink','re'),\n" +
            "\n" +
            "  ('11,'Yota','re'),\n" +
            "\n" +
            "  ('12,'Baykalwestcom','re'),\n" +
            "\n" +
            "  ('12,'Akos','re'),\n" +
            "\n" +
            "  ('14,'MegaFon','re'),\n" +
            "\n" +
            "  ('16,'NTC','re'),\n" +
            "\n" +
            "  ('17,'Utel','re'),\n" +
            "\n" +
            "  ('20,'Tele2','re'),\n" +
            "\n" +
            "  ('32,'Win Mobile','re'),\n" +
            "\n" +
            "  ('35,'MOTIV','re'),\n" +
            "\n" +
            "  ('38,'Tambov GSM','re'),\n" +
            "\n" +
            "  ('39,'Rostelecom','re'),\n" +
            "\n" +
            "  ('50,'MTS','re'),\n" +
            "\n" +
            "  ('54,'TTK','re'),\n" +
            "\n" +
            "  ('99,'Beeline','re'),\n" +
            "\n" +
            "  ('10,'MTN','re'),\n" +
            "\n" +
            "  ('13,'Tigo','re'),\n" +
            "\n" +
            "  ('14,'Airtel','re'),\n" +
            "\n" +
            "  ('17,'Olleh','re'),\n" +
            "\n" +
            "  ('1,'Sure','bl'),\n" +
            "\n" +
            "  ('50,'Digicel','bl'),\n" +
            "\n" +
            "  ('70,'Chippie','bl'),\n" +
            "\n" +
            "  ('110,'LIME','bl'),\n" +
            "\n" +
            "  ('1,'Ameris','bl'),\n" +
            "\n" +
            "  ('2,'GLOBALTEL','bl'),\n" +
            "\n" +
            "  ('70,'Digicel','bl'),\n" +
            "\n" +
            "  ('110,'Lime','bl'),\n" +
            "\n" +
            "  ('1,'Digicel','bl'),\n" +
            "\n" +
            "  ('27,'Bluesky','bl'),\n" +
            "\n" +
            "  ('1,'PRIMA','bl'),\n" +
            "\n" +
            "  ('1,'CSTmovel','bl'),\n" +
            "\n" +
            "  ('1,'Al Jawal (STC )','bl'),\n" +
            "\n" +
            "  ('3,'Mobily','bl'),\n" +
            "\n" +
            "  ('4,'Zain SA','bl'),\n" +
            "\n" +
            "  ('5,'Virgin Mobile','bl'),\n" +
            "\n" +
            "  ('21,'RGSM','bl'),\n" +
            "\n" +
            "  ('1,'Orange','bl'),\n" +
            "\n" +
            "  ('2,'Tigo','bl'),\n" +
            "\n" +
            "  ('3,'Expresso','bl'),\n" +
            "\n" +
            "  ('1,'Telenor','bl'),\n" +
            "\n" +
            "  ('3,'mt:s','bl'),\n" +
            "\n" +
            "  ('5,'VIP','bl'),\n" +
            "\n" +
            "  ('1,'Cable & Wireless','bl'),\n" +
            "\n" +
            "  ('10,'Airtel','bl'),\n" +
            "\n" +
            "  ('1,'Airtel','bl'),\n" +
            "\n" +
            "  ('3,'Africell','bl'),\n" +
            "\n" +
            "  ('5,'Africell','bl'),\n" +
            "\n" +
            "  ('6,'SierraTel','bl'),\n" +
            "\n" +
            "  ('9,'Smart Mobile','bl'),\n" +
            "\n" +
            "  ('1,'SingTel','bl'),\n" +
            "\n" +
            "  ('2,'SingTel-G18','bl'),\n" +
            "\n" +
            "  ('3,'M1','bl'),\n" +
            "\n" +
            "  ('5,'StarHub','bl'),\n" +
            "\n" +
            "  ('12,'Grid','bl'),\n" +
            "\n" +
            "  ('1,'Orange','bl'),\n" +
            "\n" +
            "  ('2,'Telekom','bl'),\n" +
            "\n" +
            "  ('3,'Swan','bl'),\n" +
            "\n" +
            "  ('4,'Telekom','bl'),\n" +
            "\n" +
            "  ('5,'Orange','bl'),\n" +
            "\n" +
            "  ('6,'O2','bl'),\n" +
            "\n" +
            "  ('99,'�SR','bl'),\n" +
            "\n" +
            "  ('40,'Si.mobil','bl'),\n" +
            "\n" +
            "  ('41,'Mobitel','bl'),\n" +
            "\n" +
            "  ('64,'T-2','bl'),\n" +
            "\n" +
            "  ('70,'Tu�mobil','bl'),\n" +
            "\n" +
            "  ('1,'BREEZE','bl'),\n" +
            "\n" +
            "  ('2,'BeMobile','bl'),\n" +
            "\n" +
            "  ('1,'Telesom','bl'),\n" +
            "\n" +
            "  ('4,'SomaCyber','bl'),\n" +
            "\n" +
            "  ('4,'Somafone','bl'),\n" +
            "\n" +
            "  ('10,'Nationlink','bl'),\n" +
            "\n" +
            "  ('50,'Hormuud','bl'),\n" +
            "\n" +
            "  ('30,'Golis','bl'),\n" +
            "\n" +
            "  ('57,'UNITEL','bl'),\n" +
            "\n" +
            "  ('60,'Nationlink Telecom','bl'),\n" +
            "\n" +
            "  ('67,'Horntel Group','bl'),\n" +
            "\n" +
            "  ('71,'Somtel','bl'),\n" +
            "\n" +
            "  ('82,'Telcom','bl'),\n" +
            "\n" +
            "  ('1,'Vodacom','bl'),\n" +
            "\n" +
            "  ('2,'Telkom','bl'),\n" +
            "\n" +
            "  ('7,'Cell C','bl'),\n" +
            "\n" +
            "  ('10,'MTN','bl'),\n" +
            "\n" +
            "  ('13,'Neotel','bl'),\n" +
            "\n" +
            "  ('14,'Neotel','bl'),\n" +
            "\n" +
            "  ('19,'iBurst','bl'),\n" +
            "\n" +
            "  ('2,'MTN','bl'),\n" +
            "\n" +
            "  ('3,'Gemtel','bl'),\n" +
            "\n" +
            "  ('4,'Vivacell','bl'),\n" +
            "\n" +
            "  ('6,'Zain','bl'),\n" +
            "\n" +
            "  ('7,'Sudani','bl'),\n" +
            "\n" +
            "  ('1,'Vodafone','bl'),\n" +
            "\n" +
            "  ('3,'Orange','bl'),\n" +
            "\n" +
            "  ('4,'Yoigo','bl'),\n" +
            "\n" +
            "  ('5,'TME','bl'),\n" +
            "\n" +
            "  ('6,'Vodafone','bl'),\n" +
            "\n" +
            "  ('7,'movistar','bl'),\n" +
            "\n" +
            "  ('8,'Euskaltel','bl'),\n" +
            "\n" +
            "  ('9,'Orange','bl'),\n" +
            "\n" +
            "  ('15,'BT','bl'),\n" +
            "\n" +
            "  ('16,'TeleCable','bl'),\n" +
            "\n" +
            "  ('17,'M�bil R','bl'),\n" +
            "\n" +
            "  ('18,'ONO','bl'),\n" +
            "\n" +
            "  ('19,'Simyo','bl'),\n" +
            "\n" +
            "  ('20,'Fonyou','bl'),\n" +
            "\n" +
            "  ('21,'Jazztel','bl'),\n" +
            "\n" +
            "  ('22,'DigiMobil','bl'),\n" +
            "\n" +
            "  ('24,'Eroski','bl'),\n" +
            "\n" +
            "  ('25,'Lycamobile','bl'),\n" +
            "\n" +
            "  ('32,'Tuenti','bl'),\n" +
            "\n" +
            "  ('51,'ADIF','bl'),\n" +
            "\n" +
            "  ('1,'Mobitel','bl'),\n" +
            "\n" +
            "  ('2,'Dialog','bl'),\n" +
            "\n" +
            "  ('3,'Etisalat','bl'),\n" +
            "\n" +
            "  ('5,'Airtel','bl'),\n" +
            "\n" +
            "  ('8,'Hutch','bl'),\n" +
            "\n" +
            "  ('1,'Zain SD','bl'),\n" +
            "\n" +
            "  ('2,'MTN','bl'),\n" +
            "\n" +
            "  ('5,'Canar Telecom','bl'),\n" +
            "\n" +
            "  ('7,'Sudani One','bl'),\n" +
            "\n" +
            "  ('2,'Telesur','bl'),\n" +
            "\n" +
            "  ('3,'Digicel','bl'),\n" +
            "\n" +
            "  ('4,'Uniqa','bl'),\n" +
            "\n" +
            "  ('10,'Swazi MTN','bl'),\n" +
            "\n" +
            "  ('1,'Telia','bl'),\n" +
            "\n" +
            "  ('2,'3','bl'),\n" +
            "\n" +
            "  ('3,'Net 1','bl'),\n" +
            "\n" +
            "  ('4,'SWEDEN','bl'),\n" +
            "\n" +
            "  ('5,'Sweden 3G','bl'),\n" +
            "\n" +
            "  ('6,'Telenor','bl'),\n" +
            "\n" +
            "  ('7,'Tele2','bl'),\n" +
            "\n" +
            "  ('10,'Spring Mobil','bl'),\n" +
            "\n" +
            "  ('12,'Lycamobile','bl'),\n" +
            "\n" +
            "  ('17,'Gotanet','bl'),\n" +
            "\n" +
            "  ('19,'Vectone Mobile / Delight Mobile','bl'),\n" +
            "\n" +
            "  ('21,'MobiSir','bl'),\n" +
            "\n" +
            "  ('24,'Sweden 2G','bl'),\n" +
            "\n" +
            "  ('38,'Voxbone','bl'),\n" +
            "\n" +
            "  ('1,'Swisscom','bl'),\n" +
            "\n" +
            "  ('2,'Sunrise','bl'),\n" +
            "\n" +
            "  ('3,'Salt','bl'),\n" +
            "\n" +
            "  ('6,'SBB-CFF-FFS','bl'),\n" +
            "\n" +
            "  ('8,'Tele4u','bl'),\n" +
            "\n" +
            "  ('1,'Syriatel','bl'),\n" +
            "\n" +
            "  ('2,'MTN','bl'),\n" +
            "\n" +
            "  ('1,'FarEasTone','tw'),\n" +
            "\n" +
            "  ('5,'APTG','tw'),\n" +
            "\n" +
            "  ('6,'FarEasTone','tw'),\n" +
            "\n" +
            "  ('9,'VMAX','tw'),\n" +
            "\n" +
            "  ('10,'G1','tw'),\n" +
            "\n" +
            "  ('11,'Chunghwa LDM','tw'),\n" +
            "\n" +
            "  ('88,'FarEasTone','tw'),\n" +
            "\n" +
            "  ('89,'T Star','tw'),\n" +
            "\n" +
            "  ('92,'Chunghwa','tw'),\n" +
            "\n" +
            "  ('97,'Taiwan Mobile','tw'),\n" +
            "\n" +
            "  ('1,'Tcell','tw'),\n" +
            "\n" +
            "  ('2,'Tcell','tw'),\n" +
            "\n" +
            "  ('3,'Megafon Tajikistan','tw'),\n" +
            "\n" +
            "  ('4,'Babilon-M','tw'),\n" +
            "\n" +
            "  ('5,'Beeline','tw'),\n" +
            "\n" +
            "  ('2,'tiGO','tw'),\n" +
            "\n" +
            "  ('3,'Zantel','tw'),\n" +
            "\n" +
            "  ('4,'Vodacom','tw'),\n" +
            "\n" +
            "  ('5,'Airtel','tw'),\n" +
            "\n" +
            "  ('6,'Sasatel','tw'),\n" +
            "\n" +
            "  ('7,'TTCL Mobile','tw'),\n" +
            "\n" +
            "  ('8,'Benson Online (BOL)','tw'),\n" +
            "\n" +
            "  ('11,'SmileCom','tw'),\n" +
            "\n" +
            "  ('0,'my by CAT','tw'),\n" +
            "\n" +
            "  ('1,'AIS','tw'),\n" +
            "\n" +
            "  ('2,'CAT CDMA','tw'),\n" +
            "\n" +
            "  ('3,'AIS 3G','tw'),\n" +
            "\n" +
            "  ('4,'truemove H 4G LTE','tw'),\n" +
            "\n" +
            "  ('5,'dtac TriNet','tw'),\n" +
            "\n" +
            "  ('15,'TOT 3G','tw'),\n" +
            "\n" +
            "  ('18,'dtac','tw'),\n" +
            "\n" +
            "  ('25,'WE PCT','tw'),\n" +
            "\n" +
            "  ('99,'truemove','tw'),\n" +
            "\n" +
            "  ('1,'Togo Cell','tw'),\n" +
            "\n" +
            "  ('3,'Moov','tw'),\n" +
            "\n" +
            "  ('1,'U-Call','tw'),\n" +
            "\n" +
            "  ('88,'Digicel','tw'),\n" +
            "\n" +
            "  ('12,'bmobile','tw'),\n" +
            "\n" +
            "  ('130,'Digicel','tw'),\n" +
            "\n" +
            "  ('1,'Orange','tw'),\n" +
            "\n" +
            "  ('2,'Tunicell','tw'),\n" +
            "\n" +
            "  ('3,'OOREDOO TN','tw'),\n" +
            "\n" +
            "  ('1,'Turkcell','tw'),\n" +
            "\n" +
            "  ('2,'Vodafone','tw'),\n" +
            "\n" +
            "  ('3,'Avea','tw'),\n" +
            "\n" +
            "  ('1,'MTS','tw'),\n" +
            "\n" +
            "  ('2,'TM-Cell','tw'),\n" +
            "\n" +
            "  ('3,'AGTS CDMA','tw'),\n" +
            "\n" +
            "  ('50,'Digicel','tw'),\n" +
            "\n" +
            "  ('350,'C&W','tw'),\n" +
            "\n" +
            "  ('352,'IslandCom','tw'),\n" +
            "\n" +
            "  ('1,'TTC','tw'),\n" +
            "\n" +
            "  ('1,'Airtel','ug'),\n" +
            "\n" +
            "  ('6,'Vodafone','ug'),\n" +
            "\n" +
            "  ('10,'MTN','ug'),\n" +
            "\n" +
            "  ('11,'UTL','ug'),\n" +
            "\n" +
            "  ('14,'Africell','ug'),\n" +
            "\n" +
            "  ('22,'Airtel','ug'),\n" +
            "\n" +
            "  ('33,'Smile','ug'),\n" +
            "\n" +
            "  ('44,'K2','ug')";
}
