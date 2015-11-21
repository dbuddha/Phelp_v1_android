package com.mkbz.phelp.database.table;

import android.provider.BaseColumns;

import com.mkbz.phelp.database.Table;

/**
 * Created by MARCELO on 15-11-2015.
 */
public class USSDTable implements Table {


    private static final String INSERT_TABLE="INSERT INTO country (code,code2,name) VALUES ('AF','AFG','Afghanistan'),\n" +
            "  ('AL','ALB','Albania'),\n" +
            "  ('DZ','DZA','Algeria'),\n" +
            "  ('AS','ASM','American Samoa'),\n" +
            "  ('AD','AND','Andorra'),\n" +
            "  ('AO','AGO','Angola'),\n" +
            "  ('AI','AIA','Anguilla'),\n" +
            "  ('AQ','ATA','Antarctica'),\n" +
            "  ('AG','ATG','Antigua and Barbuda'),\n" +
            "  ('AR','ARG','Argentina'),\n" +
            "  ('AM','ARM','Armenia'),\n" +
            "  ('AW','ABW','Aruba'),\n" +
            "  ('AU','AUS','Australia'),\n" +
            "  ('AT','AUT','Austria'),\n" +
            "  ('AZ','AZE','Azerbaijan'),\n" +
            "  ('BS','BHS','Bahamas'),\n" +
            "  ('BH','BHR','Bahrain'),\n" +
            "  ('BD','BGD','Bangladesh'),\n" +
            "  ('BB','BRB','Barbados'),\n" +
            "  ('BY','BLR','Belarus'),\n" +
            "  ('BE','BEL','Belgium'),\n" +
            "  ('BZ','BLZ','Belize'),\n" +
            "  ('BJ','BEN','Benin'),\n" +
            "  ('BM','BMU','Bermuda'),\n" +
            "  ('BT','BTN','Bhutan'),\n" +
            "  ('BO','BOL','Bolivia'),\n" +
            "  ('BA','BIH','Bosnia and Herzegovina'),\n" +
            "  ('BW','BWA','Botswana'),\n" +
            "  ('BV','BVT','Bouvet Island'),\n" +
            "  ('BR','BRA','Brazil'),\n" +
            "  ('IO','IOT','British Indian Ocean Territory'),\n" +
            "  ('VG','VGB','British Virgin Islands'),\n" +
            "  ('BN','BRN','Brunei Darussalam'),\n" +
            "  ('BG','BGR','Bulgaria'),\n" +
            "  ('BF','BFA','Burkina Faso'),\n" +
            "  ('BI','BDI','Burundi'),\n" +
            "  ('KH','KHM','Cambodia'),\n" +
            "  ('CM','CMR','Cameroon'),\n" +
            "  ('CA','CAN','Canada'),\n" +
            "  ('CV','CPV','Cape Verde'),\n" +
            "  ('KY','CYM','Cayman Islands'),\n" +
            "  ('CF','CAF','Central African Republic'),\n" +
            "  ('TD','TCD','Chad'),\n" +
            "  ('CL','CHL','Chile'),\n" +
            "  ('CN','CHN','China'),\n" +
            "  ('CX','CXR','Christmas Island'),\n" +
            "  ('CC','CCK','CocosIslands'),\n" +
            "  ('CO','COL','Colombia'),\n" +
            "  ('KM','COM','Comoros'),\n" +
            "  ('CD','COD','Congo'),\n" +
            "  ('CG','COG','Congo'),\n" +
            "  ('CK','COK','Cook Islands'),\n" +
            "  ('CR','CRI','Costa Rica'),\n" +
            "  ('CI','CIV','Cote D'Ivoire'),\n" +
            "  ('CU','CUB','Cuba'),\n" +
            "  ('CY','CYP','Cyprus'),\n" +
            "  ('CZ','CZE','Czech Republic'),\n" +
            "  ('DK','DNK','Denmark'),\n" +
            "  ('DJ','DJI','Djibouti'),\n" +
            "  ('DM','DMA','Dominica'),\n" +
            "  ('DO','DOM','Dominican Republic'),\n" +
            "  ('EC','ECU','Ecuador'),\n" +
            "  ('EG','EGY','Egypt'),\n" +
            "  ('SV','SLV','El Salvador'),\n" +
            "  ('GQ','GNQ','Equatorial Guinea'),\n" +
            "  ('ER','ERI','Eritrea'),\n" +
            "  ('EE','EST','Estonia'),\n" +
            "  ('ET','ETH','Ethiopia'),\n" +
            "  ('FO','FRO','Faeroe Islands'),\n" +
            "  ('FK','FLK','Falkland Islands'),\n" +
            "  ('FJ','FJI','Fiji'),\n" +
            "  ('FI','FIN','Finland'),\n" +
            "  ('FR','FRA','France'),\n" +
            "  ('GF','GUF','French Guiana'),\n" +
            "  ('PF','PYF','French Polynesia'),\n" +
            "  ('TF','ATF','French Southern Territories'),\n" +
            "  ('GA','GAB','Gabon'),\n" +
            "  ('GM','GMB','Gambia'),\n" +
            "  ('GE','GEO','Georgia'),\n" +
            "  ('DE','DEU','Germany'),\n" +
            "  ('GH','GHA','Ghana'),\n" +
            "  ('GI','GIB','Gibraltar'),\n" +
            "  ('GR','GRC','Greece'),\n" +
            "  ('GL','GRL','Greenland'),\n" +
            "  ('GD','GRD','Grenada'),\n" +
            "  ('GP','GLP','Guadaloupe'),\n" +
            "  ('GU','GUM','Guam'),\n" +
            "  ('GT','GTM','Guatemala'),\n" +
            "  ('GN','GIN','Guinea'),\n" +
            "  ('GW','GNB','Guinea-Bissau'),\n" +
            "  ('GY','GUY','Guyana'),\n" +
            "  ('HT','HTI','Haiti'),\n" +
            "  ('HM','HMD','Heard and McDonald Islands'),\n" +
            "  ('VA','VAT','Holy See'),\n" +
            "  ('HN','HND','Honduras'),\n" +
            "  ('HK','HKG','Hong Kong'),\n" +
            "  ('HR','HRV','Hrvatska'),\n" +
            "  ('HU','HUN','Hungary'),\n" +
            "  ('IS','ISL','Iceland'),\n" +
            "  ('IN','IND','India'),\n" +
            "  ('ID','IDN','Indonesia'),\n" +
            "  ('IR','IRN','Iran'),\n" +
            "  ('IQ','IRQ','Iraq'),\n" +
            "  ('IE','IRL','Ireland'),\n" +
            "  ('IL','ISR','Israel'),\n" +
            "  ('IT','ITA','Italy'),\n" +
            "  ('JM','JAM','Jamaica'),\n" +
            "  ('JP','JPN','Japan'),\n" +
            "  ('JO','JOR','Jordan'),\n" +
            "  ('KZ','KAZ','Kazakhstan'),\n" +
            "  ('KE','KEN','Kenya'),\n" +
            "  ('KI','KIR','Kiribati'),\n" +
            "  ('KP','PRK','Korea'),\n" +
            "  ('KR','KOR','Korea'),\n" +
            "  ('KW','KWT','Kuwait'),\n" +
            "  ('KG','KGZ','Kyrgyz Republic'),\n" +
            "  ('LA','LAO','Lao People's Democratic Republic'),\n" +
            "  ('LV','LVA','Latvia'),\n" +
            "  ('LB','LBN','Lebanon'),\n" +
            "  ('LS','LSO','Lesotho'),\n" +
            "  ('LR','LBR','Liberia'),\n" +
            "  ('LY','LBY','Libyan Arab Jamahiriya'),\n" +
            "  ('LI','LIE','Liechtenstein'),\n" +
            "  ('LT','LTU','Lithuania'),\n" +
            "  ('LU','LUX','Luxembourg'),\n" +
            "  ('MO','MAC','Macao'),\n" +
            "  ('MK','MKD','Macedonia'),\n" +
            "  ('MG','MDG','Madagascar'),\n" +
            "  ('MW','MWI','Malawi'),\n" +
            "  ('MY','MYS','Malaysia'),\n" +
            "  ('MV','MDV','Maldives'),\n" +
            "  ('ML','MLI','Mali'),\n" +
            "  ('MT','MLT','Malta'),\n" +
            "  ('MH','MHL','Marshall Islands'),\n" +
            "  ('MQ','MTQ','Martinique'),\n" +
            "  ('MR','MRT','Mauritania'),\n" +
            "  ('MU','MUS','Mauritius'),\n" +
            "  ('YT','MYT','Mayotte'),\n" +
            "  ('MX','MEX','Mexico'),\n" +
            "  ('FM','FSM','Micronesia'),\n" +
            "  ('MD','MDA','Moldova'),\n" +
            "  ('MC','MCO','Monaco'),\n" +
            "  ('MN','MNG','Mongolia'),\n" +
            "  ('MS','MSR','Montserrat'),\n" +
            "  ('MA','MAR','Morocco'),\n" +
            "  ('MZ','MOZ','Mozambique'),\n" +
            "  ('MM','MMR','Myanmar'),\n" +
            "  ('NA','NAM','Namibia'),\n" +
            "  ('NR','NRU','Nauru'),\n" +
            "  ('NP','NPL','Nepal'),\n" +
            "  ('AN','ANT','Netherlands Antilles'),\n" +
            "  ('NL','NLD','Netherlands'),\n" +
            "  ('NC','NCL','New Caledonia'),\n" +
            "  ('NZ','NZL','New Zealand'),\n" +
            "  ('NI','NIC','Nicaragua'),\n" +
            "  ('NE','NER','Niger'),\n" +
            "  ('NG','NGA','Nigeria'),\n" +
            "  ('NU','NIU','Niue'),\n" +
            "  ('NF','NFK','Norfolk Island'),\n" +
            "  ('MP','MNP','Northern Mariana Islands'),\n" +
            "  ('NO','NOR','Norway'),\n" +
            "  ('OM','OMN','Oman'),\n" +
            "  ('PK','PAK','Pakistan'),\n" +
            "  ('PW','PLW','Palau'),\n" +
            "  ('PS','PSE','Palestinian Territory'),\n" +
            "  ('PA','PAN','Panama'),\n" +
            "  ('PG','PNG','Papua New Guinea'),\n" +
            "  ('PY','PRY','Paraguay'),\n" +
            "  ('PE','PER','Peru'),\n" +
            "  ('PH','PHL','Philippines'),\n" +
            "  ('PN','PCN','Pitcairn Island'),\n" +
            "  ('PL','POL','Poland'),\n" +
            "  ('PT','PRT','Portugal'),\n" +
            "  ('PR','PRI','Puerto Rico'),\n" +
            "  ('QA','QAT','Qatar'),\n" +
            "  ('RE','REU','Reunion'),\n" +
            "  ('RO','ROU','Romania'),\n" +
            "  ('RU','RUS','Russian Federation'),\n" +
            "  ('RW','RWA','Rwanda'),\n" +
            "  ('SH','SHN','St. Helena'),\n" +
            "  ('KN','KNA','St. Kitts and Nevis'),\n" +
            "  ('LC','LCA','St. Lucia'),\n" +
            "  ('PM','SPM','St. Pierre and Miquelon'),\n" +
            "  ('VC','VCT','St. Vincent and the Grenadines'),\n" +
            "  ('WS','WSM','Samoa'),\n" +
            "  ('SM','SMR','San Marino'),\n" +
            "  ('ST','STP','Sao Tome and Principe'),\n" +
            "  ('SA','SAU','Saudi Arabia'),\n" +
            "  ('SN','SEN','Senegal'),\n" +
            "  ('CS','SCG','Serbia and Montenegro'),\n" +
            "  ('SC','SYC','Seychelles'),\n" +
            "  ('SL','SLE','Sierra Leone'),\n" +
            "  ('SG','SGP','Singapore'),\n" +
            "  ('SK','SVK','Slovakia'),\n" +
            "  ('SI','SVN','Slovenia'),\n" +
            "  ('SB','SLB','Solomon Islands'),\n" +
            "  ('SO','SOM','Somalia'),\n" +
            "  ('ZA','ZAF','South Africa'),\n" +
            "  ('GS','SGS','South Georgia and the South Sandwich Islands'),\n" +
            "  ('ES','ESP','Spain'),\n" +
            "  ('LK','LKA','Sri Lanka'),\n" +
            "  ('SD','SDN','Sudan'),\n" +
            "  ('SR','SUR','Suriname'),\n" +
            "  ('SJ','SJM','Svalbard & Jan Mayen Islands'),\n" +
            "  ('SZ','SWZ','Swaziland'),\n" +
            "  ('SE','SWE','Sweden'),\n" +
            "  ('CH','CHE','Switzerland'),\n" +
            "  ('SY','SYR','Syrian Arab Republic'),\n" +
            "  ('TW','TWN','Taiwan'),\n" +
            "  ('TJ','TJK','Tajikistan'),\n" +
            "  ('TZ','TZA','Tanzania'),\n" +
            "  ('TH','THA','Thailand'),\n" +
            "  ('TL','TLS','Timor-Leste'),\n" +
            "  ('TG','TGO','Togo'),\n" +
            "  ('TK','TKL','Tokelau'),\n" +
            "  ('TO','TON','Tonga'),\n" +
            "  ('TT','TTO','Trincodead and Tobago'),\n" +
            "  ('TN','TUN','Tunisia'),\n" +
            "  ('TR','TUR','Turkey'),\n" +
            "  ('TM','TKM','Turkmenistan'),\n" +
            "  ('TC','TCA','Turks and Caicos Islands'),\n" +
            "  ('TV','TUV','Tuvalu'),\n" +
            "  ('VI','VIR','US Virgin Islands'),\n" +
            "  ('UG','UGA','Uganda'),\n" +
            "  ('UA','UKR','Ukraine'),\n" +
            "  ('AE','ARE','United Arab Emirates'),\n" +
            "  ('GB','GBR','United Kingdom of Great Britain & N. Ireland'),\n" +
            "  ('UM','UMI','United States Minor Outlying Islands'),\n" +
            "  ('US','USA','United States of America'),\n" +
            "  ('UY','URY','Uruguay'),\n" +
            "  ('UZ','UZB','Uzbekistan'),\n" +
            "  ('VU','VUT','Vanuatu'),\n" +
            "  ('VE','VEN','Venezuela'),\n" +
            "  ('VN','VNM','Viet Nam'),\n" +
            "  ('WF','WLF','Wallis and Futuna Islands'),\n" +
            "  ('EH','ESH','Western Sahara'),\n" +
            "  ('YE','YEM','Yemen'),\n" +
            "  ('ZM','ZMB','Zambia'),\n" +
            "  ('ZW','ZWE','Zimbabwe'),";

    public static final String SQL_CREATE_TABLE =
        CREATE_TABLE + USSDEntry.TABLE_NAME + " (" +
                USSDEntry.ID + INTEGER_TYPE + COMMA_SEP +
                USSDEntry.TITLE + TEXT_TYPE + COMMA_SEP +
                USSDEntry.DESCRIPTION + TEXT_TYPE + COMMA_SEP +
                USSDEntry.CODE + TEXT_TYPE + COMMA_SEP +
                PRIMARY_KEY + "(" +
                USSDEntry.ID  +
                ") )";
    public static final String SQL_DROP_TABLE =
            "DROP TABLE IF EXISTS " + USSDEntry.TABLE_NAME;

    public static final String[] COLUMNS={USSDEntry.ID,USSDEntry.TITLE,USSDEntry.DESCRIPTION,USSDEntry.CODE};

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


    protected static abstract class USSDEntry implements BaseColumns {
        public static final String TABLE_NAME = "ussd";
        public static final String ID = "id";
        public static final String TITLE = "title";
        public static final String DESCRIPTION = "description";
        public static final String CODE = "code";
    }


}
