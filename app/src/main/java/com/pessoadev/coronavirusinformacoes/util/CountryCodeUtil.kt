package com.pessoadev.coronavirusinformacoes.util

import java.util.*


class CountryCodeUtil {
    val map: MutableMap<String, String> =
        TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER)

    fun getCode(country: String?): String? {
        var countryFound = map[country]
        if (countryFound == null) {
            countryFound = null
        }
        return countryFound
    }

    init {
        map["Andorra, Principality Of"] = "AD"
        map["United Arab Emirates"] = "AE"
        map["Afghanistan"] = "AF"
        map["Andorra"] = "AD"
        map["Antigua And Barbuda"] = "AG"
        map["Anguilla"] = "AI"
        map["Albania"] = "AL"
        map["Azerbaijan"] = "AZ"
        map["Armenia"] = "AM"
        map["Netherlands Antilles"] = "AN"
        map["Angola"] = "AO"
        map["Antarctica"] = "AQ"
        map["Argentina"] = "AR"
        map["American Samoa"] = "AS"
        map["Austria"] = "AT"
        map["Australia"] = "AU"
        map["Aruba"] = "AW"
        map["Azerbaidjan"] = "AZ"
        map["Bosnia and Herzegovina"] = "BA"
        map["Barbados"] = "BB"
        map["Bangladesh"] = "BD"
        map["Belgium"] = "BE"
        map["Burkina Faso"] = "BF"
        map["Bulgaria"] = "BG"
        map["Bahrain"] = "BH"
        map["Burundi"] = "BI"
        map["Benin"] = "BJ"
        map["Bermuda"] = "BM"
        map["Brunei"] = "BN"
        map["Bolivia"] = "BO"
        map["Brazil"] = "BR"
        map["Bahamas"] = "BS"
        map["Bhutan"] = "BT"
        map["Bouvet Island"] = "BV"
        map["Botswana"] = "BW"
        map["Belarus"] = "BY"
        map["Belize"] = "BZ"
        map["Canada"] = "CA"
        map["Cocos (Keeling) Islands"] = "CC"
        map["Central African Republic"] = "CF"
        map["Congo (Brazzaville)"] = "CD"
        map["Congo (Kinshasa)"] = "CG"
        map["Switzerland"] = "CH"
        map["Cote D'Ivoire"] = "CI"
        map["Cook Islands"] = "CK"
        map["Chile"] = "CL"
        map["Cameroon"] = "CM"
        map["China"] = "CN"
        map["Colombia"] = "CO"
        map["Costa Rica"] = "CR"
        map["Former Czechoslovakia"] = "CS"
        map["Cuba"] = "CU"
        map["Cabo Verde"] = "CV"
        map["Christmas Island"] = "CX"
        map["Cyprus"] = "CY"
        map["czechia"] = "CZ"
        map["Germany"] = "DE"
        map["Djibouti"] = "DJ"
        map["Denmark"] = "DK"
        map["Dominica"] = "DM"
        map["Dominican Republic"] = "DO"
        map["Algeria"] = "DZ"
        map["Ecuador"] = "EC"
        map["Estonia"] = "EE"
        map["Egypt"] = "EG"
        map["Western Sahara"] = "EH"
        map["Eritrea"] = "ER"
        map["Spain"] = "ES"
        map["Ethiopia"] = "ET"
        map["Finland"] = "FI"
        map["Fiji"] = "FJ"
        map["Falkland Islands"] = "FK"
        map["Micronesia"] = "FM"
        map["Faroe Islands"] = "FO"
        map["France"] = "FR"
        map["France (European Territory)"] = "FX"
        map["Gabon"] = "GA"
        map["Great Britain"] = "UK"
        map["Grenada"] = "GD"
        map["Georgia"] = "GE"
        map["French Guyana"] = "GF"
        map["Ghana"] = "GH"
        map["Gibraltar"] = "GI"
        map["Greenland"] = "GL"
        map["Gambia"] = "GM"
        map["Guinea"] = "GN"
        map["Guadeloupe (French)"] = "GP"
        map["Equatorial Guinea"] = "GQ"
        map["Greece"] = "GR"
        map["S. Georgia & S. Sandwich Isls."] = "GS"
        map["Guatemala"] = "GT"
        map["Guam (USA)"] = "GU"
        map["Guinea Bissau"] = "GW"
        map["Guyana"] = "GY"
        map["Hong Kong"] = "HK"
        map["Heard And McDonald Islands"] = "HM"
        map["Honduras"] = "HN"
        map["Croatia"] = "HR"
        map["Haiti"] = "HT"
        map["Hungary"] = "HU"
        map["Indonesia"] = "ID"
        map["Ireland"] = "IE"
        map["Israel"] = "IL"
        map["India"] = "IN"
        map["British Indian Ocean Territory"] = "IO"
        map["Iraq"] = "IQ"
        map["Iran"] = "IR"
        map["Iceland"] = "IS"
        map["Italy"] = "IT"
        map["Jamaica"] = "JM"
        map["Jordan"] = "JO"
        map["Japan"] = "JP"
        map["Kenya"] = "KE"
        map["Kyrgyz Republic (Kyrgyzstan)"] = "KG"
        map["Cambodia"] = "KH"
        map["Kiribati"] = "KI"
        map["Comoros"] = "KM"
        map["Saint Kitts & Nevis Anguilla"] = "KN"
        map["North Korea"] = "KP"
        map["South Korea"] = "KR"
        map["Kuwait"] = "KW"
        map["Cayman Islands"] = "KY"
        map["Kazakhstan"] = "KZ"
        map["Laos"] = "LA"
        map["Lebanon"] = "LB"
        map["Saint Lucia"] = "LC"
        map["Liechtenstein"] = "LI"
        map["Sri Lanka"] = "LK"
        map["Liberia"] = "LR"
        map["Lesotho"] = "LS"
        map["Lithuania"] = "LT"
        map["Luxembourg"] = "LU"
        map["Latvia"] = "LV"
        map["Libya"] = "LY"
        map["Morocco"] = "MA"
        map["Monaco"] = "MC"
        map["Moldavia"] = "MD"
        map["Madagascar"] = "MG"
        map["Marshall Islands"] = "MH"
        map["Macedonia"] = "MK"
        map["Mali"] = "ML"
        map["Myanmar"] = "MM"
        map["Mongolia"] = "MN"
        map["Macau"] = "MO"
        map["Northern Mariana Islands"] = "MP"
        map["Martinique (French)"] = "MQ"
        map["Mauritania"] = "MR"
        map["Montserrat"] = "MS"
        map["Malta"] = "MT"
        map["Mauritius"] = "MU"
        map["Maldives"] = "MV"
        map["Malawi"] = "MW"
        map["Mexico"] = "MX"
        map["Malaysia"] = "MY"
        map["Mozambique"] = "MZ"
        map["Namibia"] = "NA"
        map["New Caledonia (French)"] = "NC"
        map["Niger"] = "NE"
        map["Norfolk Island"] = "NF"
        map["Nigeria"] = "NG"
        map["Nicaragua"] = "NI"
        map["Netherlands"] = "NL"
        map["Norway"] = "NO"
        map["Nepal"] = "NP"
        map["Nauru"] = "NR"
        map["Neutral Zone"] = "NT"
        map["Niue"] = "NU"
        map["New Zealand"] = "NZ"
        map["Oman"] = "OM"
        map["Panama"] = "PA"
        map["Peru"] = "PE"
        map["Polynesia (French)"] = "PF"
        map["Papua New Guinea"] = "PG"
        map["Philippines"] = "PH"
        map["Pakistan"] = "PK"
        map["Poland"] = "PL"
        map["Saint Pierre And Miquelon"] = "PM"
        map["Pitcairn Island"] = "PN"
        map["Puerto Rico"] = "PR"
        map["Portugal"] = "PT"
        map["Palau"] = "PW"
        map["Paraguay"] = "PY"
        map["Qatar"] = "QA"
        map["Reunion (French)"] = "RE"
        map["Romania"] = "RO"
        map["Russian Federation"] = "RU"
        map["Rwanda"] = "RW"
        map["Saudi Arabia"] = "SA"
        map["Solomon Islands"] = "SB"
        map["Seychelles"] = "SC"
        map["Sudan"] = "SD"
        map["Sweden"] = "SE"
        map["Singapore"] = "SG"
        map["Saint Helena"] = "SH"
        map["Slovenia"] = "SI"
        map["Svalbard And Jan Mayen Islands"] = "SJ"
        map["Slovak Republic"] = "SK"
        map["Sierra Leone"] = "SL"
        map["San Marino"] = "SM"
        map["Senegal"] = "SN"
        map["Somalia"] = "SO"
        map["Suriname"] = "SR"
        map["Saint Tome (Sao Tome) And Principe"] = "ST"
        map["Former USSR"] = "SU"
        map["El Salvador"] = "SV"
        map["Syria"] = "SY"
        map["Swaziland"] = "SZ"
        map["Turks And Caicos Islands"] = "TC"
        map["Chad"] = "TD"
        map["French Southern Territories"] = "TF"
        map["Togo"] = "TG"
        map["Thailand"] = "TH"
        map["Tadjikistan"] = "TJ"
        map["Tokelau"] = "TK"
        map["Turkmenistan"] = "TM"
        map["Tunisia"] = "TN"
        map["Tonga"] = "TO"
        map["East Timor"] = "TP"
        map["Turkey"] = "TR"
        map["Trinidad And Tobago"] = "TT"
        map["Tuvalu"] = "TV"
        map["Taiwan"] = "TW"
        map["Tanzania"] = "TZ"
        map["Ukraine"] = "UA"
        map["Uganda"] = "UG"
        map["United Kingdom"] = "UK"
        map["USA Minor Outlying Islands"] = "UM"
        map["United States"] = "US"
        map["Uruguay"] = "UY"
        map["Uzbekistan"] = "UZ"
        map["Holy See (Vatican City State)"] = "VA"
        map["Saint Vincent & Grenadines"] = "VC"
        map["Venezuela"] = "VE"
        map["Virgin Islands (British)"] = "VG"
        map["Virgin Islands (USA)"] = "VI"
        map["Vietnam"] = "VN"
        map["Vanuatu"] = "VU"
        map["Wallis And Futuna Islands"] = "WF"
        map["Samoa"] = "WS"
        map["Yemen"] = "YE"
        map["Mayotte"] = "YT"
        map["Yugoslavia"] = "YU"
        map["South Africa"] = "ZA"
        map["Zambia"] = "ZM"
        map["Zaire"] = "ZR"
        map["Zimbabwe"] = "ZW"
    }
}