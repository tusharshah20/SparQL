# filename ex549.ru

PREFIX wci: <http://www.worldcat.org/isbn/>
PREFIX owl: <http://www.w3.org/2002/07/owl#>

DELETE
{
  wci:0062515861 <http://schema.org/description> "cloth" ;
                 owl:sameAs <urn:isbn:0062515861> .
}
WHERE {}
