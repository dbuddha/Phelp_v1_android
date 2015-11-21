package com.mkbz.phelp.database.table;

import android.provider.BaseColumns;

import com.mkbz.phelp.database.Table;

/**
 * Created by MARCELO on 15-11-2015.
 */
public class CountryTable implements Table {
    private static final String INSERT_TABLE=
            "INSERT INTO country (code,code2,name) VALUES ('AF','AFG','Afghanistan');" +
            "INSERT INTO country (code,code2,name) VALUES ('AL','ALB','Albania');" +
            "INSERT INTO country (code,code2,name) VALUES ('DZ','DZA','Algeria');" +
            "INSERT INTO country (code,code2,name) VALUES ('AS','ASM','American Samoa');" +
            "INSERT INTO country (code,code2,name) VALUES ('AD','AND','Andorra');" +
            "INSERT INTO country (code,code2,name) VALUES ('AO','AGO','Angola');" +
            "INSERT INTO country (code,code2,name) VALUES ('AI','AIA','Anguilla');" +
            "INSERT INTO country (code,code2,name) VALUES ('AQ','ATA','Antarctica');" +
            "INSERT INTO country (code,code2,name) VALUES ('AG','ATG','Antigua and Barbuda');" +
            "INSERT INTO country (code,code2,name) VALUES ('AR','ARG','Argentina');" +
            "INSERT INTO country (code,code2,name) VALUES ('AM','ARM','Armenia');" +
            "INSERT INTO country (code,code2,name) VALUES ('AW','ABW','Aruba');" +
            "INSERT INTO country (code,code2,name) VALUES ('AU','AUS','Australia');" +
            "INSERT INTO country (code,code2,name) VALUES ('AT','AUT','Austria');" +
            "INSERT INTO country (code,code2,name) VALUES ('AZ','AZE','Azerbaijan');" +
            "INSERT INTO country (code,code2,name) VALUES ('BS','BHS','Bahamas');" +
            "INSERT INTO country (code,code2,name) VALUES ('BH','BHR','Bahrain');" +
            "INSERT INTO country (code,code2,name) VALUES ('BD','BGD','Bangladesh');" +
            "INSERT INTO country (code,code2,name) VALUES ('BB','BRB','Barbados');" +
            "INSERT INTO country (code,code2,name) VALUES ('BY','BLR','Belarus');" +
            "INSERT INTO country (code,code2,name) VALUES ('BE','BEL','Belgium');" +
            "INSERT INTO country (code,code2,name) VALUES ('BZ','BLZ','Belize');" +
            "INSERT INTO country (code,code2,name) VALUES ('BJ','BEN','Benin');" +
            "INSERT INTO country (code,code2,name) VALUES ('BM','BMU','Bermuda');" +
            "INSERT INTO country (code,code2,name) VALUES ('BT','BTN','Bhutan');" +
            "INSERT INTO country (code,code2,name) VALUES ('BO','BOL','Bolivia');" +
            "INSERT INTO country (code,code2,name) VALUES ('BA','BIH','Bosnia and Herzegovina');" +
            "INSERT INTO country (code,code2,name) VALUES ('BW','BWA','Botswana');" +
            "INSERT INTO country (code,code2,name) VALUES ('BV','BVT','Bouvet Island');" +
            "INSERT INTO country (code,code2,name) VALUES ('BR','BRA','Brazil');" +
            "INSERT INTO country (code,code2,name) VALUES ('IO','IOT','British Indian Ocean Territory');" +
            "INSERT INTO country (code,code2,name) VALUES ('VG','VGB','British Virgin Islands');" +
            "INSERT INTO country (code,code2,name) VALUES ('BN','BRN','Brunei Darussalam');" +
            "INSERT INTO country (code,code2,name) VALUES ('BG','BGR','Bulgaria');" +
            "INSERT INTO country (code,code2,name) VALUES ('BF','BFA','Burkina Faso');" +
            "INSERT INTO country (code,code2,name) VALUES ('BI','BDI','Burundi');" +
            "INSERT INTO country (code,code2,name) VALUES ('KH','KHM','Cambodia');" +
            "INSERT INTO country (code,code2,name) VALUES ('CM','CMR','Cameroon');" +
            "INSERT INTO country (code,code2,name) VALUES ('CA','CAN','Canada');" +
            "INSERT INTO country (code,code2,name) VALUES ('CV','CPV','Cape Verde');" +
            "INSERT INTO country (code,code2,name) VALUES ('KY','CYM','Cayman Islands');" +
            "INSERT INTO country (code,code2,name) VALUES ('CF','CAF','Central African Republic');" +
            "INSERT INTO country (code,code2,name) VALUES ('TD','TCD','Chad');" +
            "INSERT INTO country (code,code2,name) VALUES ('CL','CHL','Chile');" +
            "INSERT INTO country (code,code2,name) VALUES ('CN','CHN','China');" +
            "INSERT INTO country (code,code2,name) VALUES ('CX','CXR','Christmas Island');" +
            "INSERT INTO country (code,code2,name) VALUES ('CC','CCK','CocosIslands');" +
            "INSERT INTO country (code,code2,name) VALUES ('CO','COL','Colombia');" +
            "INSERT INTO country (code,code2,name) VALUES ('KM','COM','Comoros');" +
            "INSERT INTO country (code,code2,name) VALUES ('CD','COD','Congo');" +
            "INSERT INTO country (code,code2,name) VALUES ('CG','COG','Congo');" +
            "INSERT INTO country (code,code2,name) VALUES ('CK','COK','Cook Islands');" +
            "INSERT INTO country (code,code2,name) VALUES ('CR','CRI','Costa Rica');" +
            "INSERT INTO country (code,code2,name) VALUES ('CI','CIV','Cote DIvoire');" +
            "INSERT INTO country (code,code2,name) VALUES ('CU','CUB','Cuba');" +
            "INSERT INTO country (code,code2,name) VALUES ('CY','CYP','Cyprus');" +
            "INSERT INTO country (code,code2,name) VALUES ('CZ','CZE','Czech Republic');" +
            "INSERT INTO country (code,code2,name) VALUES ('DK','DNK','Denmark');" +
            "INSERT INTO country (code,code2,name) VALUES ('DJ','DJI','Djibouti');" +
            "INSERT INTO country (code,code2,name) VALUES ('DM','DMA','Dominica');" +
            "INSERT INTO country (code,code2,name) VALUES ('DO','DOM','Dominican Republic');" +
            "INSERT INTO country (code,code2,name) VALUES ('EC','ECU','Ecuador');" +
            "INSERT INTO country (code,code2,name) VALUES ('EG','EGY','Egypt');" +
            "INSERT INTO country (code,code2,name) VALUES ('SV','SLV','El Salvador');" +
            "INSERT INTO country (code,code2,name) VALUES ('GQ','GNQ','Equatorial Guinea');" +
            "INSERT INTO country (code,code2,name) VALUES ('ER','ERI','Eritrea');" +
            "INSERT INTO country (code,code2,name) VALUES ('EE','EST','Estonia');" +
            "INSERT INTO country (code,code2,name) VALUES ('ET','ETH','Ethiopia');" +
            "INSERT INTO country (code,code2,name) VALUES ('FO','FRO','Faeroe Islands');" +
            "INSERT INTO country (code,code2,name) VALUES ('FK','FLK','Falkland Islands');" +
            "INSERT INTO country (code,code2,name) VALUES ('FJ','FJI','Fiji');" +
            "INSERT INTO country (code,code2,name) VALUES ('FI','FIN','Finland');" +
            "INSERT INTO country (code,code2,name) VALUES ('FR','FRA','France');" +
            "INSERT INTO country (code,code2,name) VALUES ('GF','GUF','French Guiana');" +
            "INSERT INTO country (code,code2,name) VALUES ('PF','PYF','French Polynesia');" +
            "INSERT INTO country (code,code2,name) VALUES ('TF','ATF','French Southern Territories');" +
            "INSERT INTO country (code,code2,name) VALUES ('GA','GAB','Gabon');" +
            "INSERT INTO country (code,code2,name) VALUES ('GM','GMB','Gambia');" +
            "INSERT INTO country (code,code2,name) VALUES ('GE','GEO','Georgia');" +
            "INSERT INTO country (code,code2,name) VALUES ('DE','DEU','Germany');" +
            "INSERT INTO country (code,code2,name) VALUES ('GH','GHA','Ghana');" +
            "INSERT INTO country (code,code2,name) VALUES ('GI','GIB','Gibraltar');" +
            "INSERT INTO country (code,code2,name) VALUES ('GR','GRC','Greece');" +
            "INSERT INTO country (code,code2,name) VALUES ('GL','GRL','Greenland');" +
            "INSERT INTO country (code,code2,name) VALUES ('GD','GRD','Grenada');" +
            "INSERT INTO country (code,code2,name) VALUES ('GP','GLP','Guadaloupe');" +
            "INSERT INTO country (code,code2,name) VALUES ('GU','GUM','Guam');" +
            "INSERT INTO country (code,code2,name) VALUES ('GT','GTM','Guatemala');" +
            "INSERT INTO country (code,code2,name) VALUES ('GN','GIN','Guinea');" +
            "INSERT INTO country (code,code2,name) VALUES ('GW','GNB','Guinea-Bissau');" +
            "INSERT INTO country (code,code2,name) VALUES ('GY','GUY','Guyana');" +
            "INSERT INTO country (code,code2,name) VALUES ('HT','HTI','Haiti');" +
            "INSERT INTO country (code,code2,name) VALUES ('HM','HMD','Heard and McDonald Islands');" +
            "INSERT INTO country (code,code2,name) VALUES ('VA','VAT','Holy See');" +
            "INSERT INTO country (code,code2,name) VALUES ('HN','HND','Honduras');" +
            "INSERT INTO country (code,code2,name) VALUES ('HK','HKG','Hong Kong');" +
            "INSERT INTO country (code,code2,name) VALUES ('HR','HRV','Hrvatska');" +
            "INSERT INTO country (code,code2,name) VALUES ('HU','HUN','Hungary');" +
            "INSERT INTO country (code,code2,name) VALUES ('IS','ISL','Iceland');" +
            "INSERT INTO country (code,code2,name) VALUES ('IN','IND','India');" +
            "INSERT INTO country (code,code2,name) VALUES ('ID','IDN','Indonesia');" +
            "INSERT INTO country (code,code2,name) VALUES ('IR','IRN','Iran');" +
            "INSERT INTO country (code,code2,name) VALUES ('IQ','IRQ','Iraq');" +
            "INSERT INTO country (code,code2,name) VALUES ('IE','IRL','Ireland');" +
            "INSERT INTO country (code,code2,name) VALUES ('IL','ISR','Israel');" +
            "INSERT INTO country (code,code2,name) VALUES ('IT','ITA','Italy');" +
            "INSERT INTO country (code,code2,name) VALUES ('JM','JAM','Jamaica');" +
            "INSERT INTO country (code,code2,name) VALUES ('JP','JPN','Japan');" +
            "INSERT INTO country (code,code2,name) VALUES ('JO','JOR','Jordan');" +
            "INSERT INTO country (code,code2,name) VALUES ('KZ','KAZ','Kazakhstan');" +
            "INSERT INTO country (code,code2,name) VALUES ('KE','KEN','Kenya');" +
            "INSERT INTO country (code,code2,name) VALUES ('KI','KIR','Kiribati');" +
            "INSERT INTO country (code,code2,name) VALUES ('KP','PRK','Korea');" +
            "INSERT INTO country (code,code2,name) VALUES ('KR','KOR','Korea');" +
            "INSERT INTO country (code,code2,name) VALUES ('KW','KWT','Kuwait');" +
            "INSERT INTO country (code,code2,name) VALUES ('KG','KGZ','Kyrgyz Republic');" +
            "INSERT INTO country (code,code2,name) VALUES ('LA','LAO','Lao Peoples Democratic Republic');" +
            "INSERT INTO country (code,code2,name) VALUES ('LV','LVA','Latvia');" +
            "INSERT INTO country (code,code2,name) VALUES ('LB','LBN','Lebanon');" +
            "INSERT INTO country (code,code2,name) VALUES ('LS','LSO','Lesotho');" +
            "INSERT INTO country (code,code2,name) VALUES ('LR','LBR','Liberia');" +
            "INSERT INTO country (code,code2,name) VALUES ('LY','LBY','Libyan Arab Jamahiriya');" +
            "INSERT INTO country (code,code2,name) VALUES ('LI','LIE','Liechtenstein');" +
            "INSERT INTO country (code,code2,name) VALUES ('LT','LTU','Lithuania');" +
            "INSERT INTO country (code,code2,name) VALUES ('LU','LUX','Luxembourg');" +
            "INSERT INTO country (code,code2,name) VALUES ('MO','MAC','Macao');" +
            "INSERT INTO country (code,code2,name) VALUES ('MK','MKD','Macedonia');" +
            "INSERT INTO country (code,code2,name) VALUES ('MG','MDG','Madagascar');" +
            "INSERT INTO country (code,code2,name) VALUES ('MW','MWI','Malawi');" +
            "INSERT INTO country (code,code2,name) VALUES ('MY','MYS','Malaysia');" +
            "INSERT INTO country (code,code2,name) VALUES ('MV','MDV','Maldives');" +
            "INSERT INTO country (code,code2,name) VALUES ('ML','MLI','Mali');" +
            "INSERT INTO country (code,code2,name) VALUES ('MT','MLT','Malta');" +
            "INSERT INTO country (code,code2,name) VALUES ('MH','MHL','Marshall Islands');" +
            "INSERT INTO country (code,code2,name) VALUES ('MQ','MTQ','Martinique');" +
            "INSERT INTO country (code,code2,name) VALUES ('MR','MRT','Mauritania');" +
            "INSERT INTO country (code,code2,name) VALUES ('MU','MUS','Mauritius');" +
            "INSERT INTO country (code,code2,name) VALUES ('YT','MYT','Mayotte');" +
            "INSERT INTO country (code,code2,name) VALUES ('MX','MEX','Mexico');" +
            "INSERT INTO country (code,code2,name) VALUES ('FM','FSM','Micronesia');" +
            "INSERT INTO country (code,code2,name) VALUES ('MD','MDA','Moldova');" +
            "INSERT INTO country (code,code2,name) VALUES ('MC','MCO','Monaco');" +
            "INSERT INTO country (code,code2,name) VALUES ('MN','MNG','Mongolia');" +
            "INSERT INTO country (code,code2,name) VALUES ('MS','MSR','Montserrat');" +
            "INSERT INTO country (code,code2,name) VALUES ('MA','MAR','Morocco');" +
            "INSERT INTO country (code,code2,name) VALUES ('MZ','MOZ','Mozambique');" +
            "INSERT INTO country (code,code2,name) VALUES ('MM','MMR','Myanmar');" +
            "INSERT INTO country (code,code2,name) VALUES ('NA','NAM','Namibia');" +
            "INSERT INTO country (code,code2,name) VALUES ('NR','NRU','Nauru');" +
            "INSERT INTO country (code,code2,name) VALUES ('NP','NPL','Nepal');" +
            "INSERT INTO country (code,code2,name) VALUES ('AN','ANT','Netherlands Antilles');" +
            "INSERT INTO country (code,code2,name) VALUES ('NL','NLD','Netherlands');" +
            "INSERT INTO country (code,code2,name) VALUES ('NC','NCL','New Caledonia');" +
            "INSERT INTO country (code,code2,name) VALUES ('NZ','NZL','New Zealand');" +
            "INSERT INTO country (code,code2,name) VALUES ('NI','NIC','Nicaragua');" +
            "INSERT INTO country (code,code2,name) VALUES ('NE','NER','Niger');" +
            "INSERT INTO country (code,code2,name) VALUES ('NG','NGA','Nigeria');" +
            "INSERT INTO country (code,code2,name) VALUES ('NU','NIU','Niue');" +
            "INSERT INTO country (code,code2,name) VALUES ('NF','NFK','Norfolk Island');" +
            "INSERT INTO country (code,code2,name) VALUES ('MP','MNP','Northern Mariana Islands');" +
            "INSERT INTO country (code,code2,name) VALUES ('NO','NOR','Norway');" +
            "INSERT INTO country (code,code2,name) VALUES ('OM','OMN','Oman');" +
            "INSERT INTO country (code,code2,name) VALUES ('PK','PAK','Pakistan');" +
            "INSERT INTO country (code,code2,name) VALUES ('PW','PLW','Palau');" +
            "INSERT INTO country (code,code2,name) VALUES ('PS','PSE','Palestinian Territory');" +
            "INSERT INTO country (code,code2,name) VALUES ('PA','PAN','Panama');" +
            "INSERT INTO country (code,code2,name) VALUES ('PG','PNG','Papua New Guinea');" +
            "INSERT INTO country (code,code2,name) VALUES ('PY','PRY','Paraguay');" +
            "INSERT INTO country (code,code2,name) VALUES ('PE','PER','Peru');" +
            "INSERT INTO country (code,code2,name) VALUES ('PH','PHL','Philippines');" +
            "INSERT INTO country (code,code2,name) VALUES ('PN','PCN','Pitcairn Island');" +
            "INSERT INTO country (code,code2,name) VALUES ('PL','POL','Poland');" +
            "INSERT INTO country (code,code2,name) VALUES ('PT','PRT','Portugal');" +
            "INSERT INTO country (code,code2,name) VALUES ('PR','PRI','Puerto Rico');" +
            "INSERT INTO country (code,code2,name) VALUES ('QA','QAT','Qatar');" +
            "INSERT INTO country (code,code2,name) VALUES ('RE','REU','Reunion');" +
            "INSERT INTO country (code,code2,name) VALUES ('RO','ROU','Romania');" +
            "INSERT INTO country (code,code2,name) VALUES ('RU','RUS','Russian Federation');" +
            "INSERT INTO country (code,code2,name) VALUES ('RW','RWA','Rwanda');" +
            "INSERT INTO country (code,code2,name) VALUES ('SH','SHN','St. Helena');" +
            "INSERT INTO country (code,code2,name) VALUES ('KN','KNA','St. Kitts and Nevis');" +
            "INSERT INTO country (code,code2,name) VALUES ('LC','LCA','St. Lucia');" +
            "INSERT INTO country (code,code2,name) VALUES ('PM','SPM','St. Pierre and Miquelon');" +
            "INSERT INTO country (code,code2,name) VALUES ('VC','VCT','St. Vincent and the Grenadines');" +
            "INSERT INTO country (code,code2,name) VALUES ('WS','WSM','Samoa');" +
            "INSERT INTO country (code,code2,name) VALUES ('SM','SMR','San Marino');" +
            "INSERT INTO country (code,code2,name) VALUES ('ST','STP','Sao Tome and Principe');" +
            "INSERT INTO country (code,code2,name) VALUES ('SA','SAU','Saudi Arabia');" +
            "INSERT INTO country (code,code2,name) VALUES ('SN','SEN','Senegal');" +
            "INSERT INTO country (code,code2,name) VALUES ('CS','SCG','Serbia and Montenegro');" +
            "INSERT INTO country (code,code2,name) VALUES ('SC','SYC','Seychelles');" +
            "INSERT INTO country (code,code2,name) VALUES ('SL','SLE','Sierra Leone');" +
            "INSERT INTO country (code,code2,name) VALUES ('SG','SGP','Singapore');" +
            "INSERT INTO country (code,code2,name) VALUES ('SK','SVK','Slovakia');" +
            "INSERT INTO country (code,code2,name) VALUES ('SI','SVN','Slovenia');" +
            "INSERT INTO country (code,code2,name) VALUES ('SB','SLB','Solomon Islands');" +
            "INSERT INTO country (code,code2,name) VALUES ('SO','SOM','Somalia');" +
            "INSERT INTO country (code,code2,name) VALUES ('ZA','ZAF','South Africa');" +
            "INSERT INTO country (code,code2,name) VALUES ('GS','SGS','South Georgia and the South Sandwich Islands');" +
            "INSERT INTO country (code,code2,name) VALUES ('ES','ESP','Spain');" +
            "INSERT INTO country (code,code2,name) VALUES ('LK','LKA','Sri Lanka');" +
            "INSERT INTO country (code,code2,name) VALUES ('SD','SDN','Sudan');" +
            "INSERT INTO country (code,code2,name) VALUES ('SR','SUR','Suriname) VALUES (');" +
            "INSERT INTO country (code,code2,name) VALUES ('SJ','SJM','Svalbard & Jan Mayen Islands');" +
            "INSERT INTO country (code,code2,name) VALUES ('SZ','SWZ','Swaziland');" +
            "INSERT INTO country (code,code2,name) VALUES ('SE','SWE','Sweden');" +
            "INSERT INTO country (code,code2,name) VALUES ('CH','CHE','Switzerland');" +
            "INSERT INTO country (code,code2,name) VALUES ('SY','SYR','Syrian Arab Republic');" +
            "INSERT INTO country (code,code2,name) VALUES ('TW','TWN','Taiwan');" +
            "INSERT INTO country (code,code2,name) VALUES ('TJ','TJK','Tajikistan');" +
            "INSERT INTO country (code,code2,name) VALUES ('TZ','TZA','Tanzania');" +
            "INSERT INTO country (code,code2,name) VALUES ('TH','THA','Thailand');" +
            "INSERT INTO country (code,code2,name) VALUES ('TL','TLS','Timor Leste');" +
            "INSERT INTO country (code,code2,name) VALUES ('TG','TGO','Togo');" +
            "INSERT INTO country (code,code2,name) VALUES ('TK','TKL','Tokelau');" +
            "INSERT INTO country (code,code2,name) VALUES ('TO','TON','Tonga');" +
            "INSERT INTO country (code,code2,name) VALUES ('TT','TTO','Trincodead and Tobago');" +
            "INSERT INTO country (code,code2,name) VALUES ('TN','TUN','Tunisia');" +
            "INSERT INTO country (code,code2,name) VALUES ('TR','TUR','Turkey');" +
            "INSERT INTO country (code,code2,name) VALUES ('TM','TKM','Turkmenistan');" +
            "INSERT INTO country (code,code2,name) VALUES ('TC','TCA','Turks and Caicos Islands');" +
            "INSERT INTO country (code,code2,name) VALUES ('TV','TUV','Tuvalu');" +
            "INSERT INTO country (code,code2,name) VALUES ('VI','VIR','US Virgin Islands');" +
            "INSERT INTO country (code,code2,name) VALUES ('UG','UGA','Uganda');" +
            "INSERT INTO country (code,code2,name) VALUES ('UA','UKR','Ukraine');" +
            "INSERT INTO country (code,code2,name) VALUES ('AE','ARE','United Arab Emirates');" +
            "INSERT INTO country (code,code2,name) VALUES ('GB','GBR','United Kingdom of Great Britain & N. Ireland');" +
            "INSERT INTO country (code,code2,name) VALUES ('UM','UMI','United States Minor Outlying Islands');" +
            "INSERT INTO country (code,code2,name) VALUES ('US','USA','United States of America');" +
            "INSERT INTO country (code,code2,name) VALUES ('UY','URY','Uruguay');" +
            "INSERT INTO country (code,code2,name) VALUES ('UZ','UZB','Uzbekistan');" +
            "INSERT INTO country (code,code2,name) VALUES ('VU','VUT','Vanuatu');" +
            "INSERT INTO country (code,code2,name) VALUES ('VE','VEN','Venezuela');" +
            "INSERT INTO country (code,code2,name) VALUES ('VN','VNM','Viet Nam');" +
            "INSERT INTO country (code,code2,name) VALUES ('WF','WLF','Wallis and Futuna Islands');" +
            "INSERT INTO country (code,code2,name) VALUES ('EH','ESH','Western Sahara');" +
            "INSERT INTO country (code,code2,name) VALUES ('YE','YEM','Yemen');" +
            "INSERT INTO country (code,code2,name) VALUES ('ZM','ZMB','Zambia');" +
            "INSERT INTO country (code,code2,name) VALUES ('ZW','ZWE','Zimbabwe')";


    public static final String SQL_CREATE_TABLE =
            CREATE_TABLE + CountryEntry.TABLE_NAME + " (" +
                    CountryEntry.ID + INTEGER_TYPE + COMMA_SEP +
                    CountryEntry.CODE + TEXT_TYPE + COMMA_SEP +
                    CountryEntry.CODE2 + TEXT_TYPE + COMMA_SEP +
                    CountryEntry.NAME + TEXT_TYPE + COMMA_SEP +
                    PRIMARY_KEY + "(" +
                    CountryEntry.ID  +
                    ") )";
    public static final String SQL_DROP_TABLE =
            "DROP TABLE IF EXISTS " + CountryEntry.TABLE_NAME;

    public static final String[] COLUMNS={CountryEntry.ID,CountryEntry.CODE,CountryEntry.CODE2,CountryEntry.NAME};

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


    protected static abstract class CountryEntry implements BaseColumns {
        public static final String TABLE_NAME = "country";
        public static final String ID = "id";
        public static final String CODE = "code";
        public static final String CODE2 = "code2";
        public static final String NAME = "name";
    }
}
