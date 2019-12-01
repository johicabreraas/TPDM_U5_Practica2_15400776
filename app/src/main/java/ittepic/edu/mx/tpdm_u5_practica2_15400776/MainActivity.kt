package ittepic.edu.mx.tpdm_u5_practica2_15400776

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var Mapaa: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }
    override fun onMapReady(googleMap: GoogleMap) {
        Mapaa = googleMap
        Mapaa.mapType = GoogleMap.MAP_TYPE_TERRAIN
        val itt = LatLng(21.476913340719847, -104.86665880756551)
        Mapaa.addMarker(MarkerOptions().position(itt).title("InstitutoTecnologicoTepic"))
        Mapaa.moveCamera(CameraUpdateFactory.newLatLngZoom(itt,15f))

        val ADMON = LatLng(21.47853519744301,-104.8655966527408)////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(ADMON).title("Edificio Administrativo: edificio donde se puede encontrar servicios escolares, financieros y las oficinas de coordinaciones de las carreras "))

        val uvp = LatLng(21.478148378590376,-104.86786903864515)////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(uvp).title("Edificio Unidad de vinculacion - Unidad de postgrado: Oficinas de Residencias y servicio social y aula de ingles"))

        val UD = LatLng(21.477746265492527,-104.86589706022136)////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(UD).title("Edificio Unidad Departamental: edificio de Sistemas e Industrial y cuenta con diversos salones "))

        val LIIA = LatLng(21.478819052094792,-104.86750370343906)////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(LIIA).title("Edificio LIIA: aulas de clase para las diferentes maestrias"))

        val LICBI = LatLng(21.479648383553197,-104.86710405423052)////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(LICBI).title("Edificio LICBI: Laboratorio Integral de Ciencias Basicas e Ingenieria"))

        val CB = LatLng(21.477522355826366,-104.86684387995923)////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(CB).title("Edificio Ciencias Basicas: Imparten clases de Ciencias Básicas, matematicas, contabilidad, integral etc"))

        val EF = LatLng(21.478958824166114,-104.8667553670742)////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(EF).title("Edificio F: Laboratorio de las materias de Civil y Electrica"))

        val ES = LatLng(21.478684271034,-104.8663020737498)////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(ES).title("Edificio S: edificios de aulas y oficinas del comité estudiantil"))

        val EK = LatLng(21.478829718386308,-104.86618942095237)////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(EK).title("Edificio K: oficinas del sindicato, la cafetería y un aula de clases comun"))

        val LabComputo = LatLng(21.478025341397696,-104.86709600761836)////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(LabComputo).title("Edificio Laboratorio de computo: aulas equipadas con equipo computacional para las carreras de sistemas e itics y uso de otras carreras"))

        val CI = LatLng(21.47853519744301,-104.8655966527408)////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(CI).title("Edificio Centro de Informacion Biblioteca: dicen que tienen varios libros"))

        val TA = LatLng(21.47853519744301,-104.8655966527408)////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(TA).title("Edificio Taller de Arquitectura"))

        val EJ = LatLng(21.479104271132087,-104.86620551420015)////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(EJ).title("Edificio J: Salones de Mecatronica y arquitectura"))

        val EL = LatLng(21.47901940938462,-104.86572808099893)////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(EL).title("Edificio L: edificios de aulas para las carreras de Quimica y de Gestion Empresarial"))

        val EX = LatLng(21.478894612612763,-104.86512994838957) ////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(EX).title("Edificio X: edificios de aulas para uso de todas las carreras "))

        val EN = LatLng(21.47874984823575,-104.86477589681094)  ////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(EN).title("Edificio N: edificios de Aulas para los estudiantes de las carreras de administración y gestión empresarial"))

        val EH = LatLng(21.47933389654743,-104.86612504792883)   ////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(EH).title("Edificio H: Aulas para los estudiantes de la carrera de arquitectura "))

        val EM = LatLng(21.479239051226358,-104.86553764415943) ////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(EM).title("Edificio M: edificios de aulas y labotatorios para los estudiantes de la carrera de quimica"))

        val EA = LatLng(21.47914420584432,-104.86510849072344) ////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(EA).title("Edificio A: aulas de clase comúnmente utilizadas por los alumnos de la carrera de Gestion Empresarial"))

        val EA2 = LatLng(21.479051856326848,-104.86480674220975) ////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(EA2).title("Edificio A: aulas de clase comúnmente utilizadas por los alumnos de la carrera de Gestion Empresarial"))

        val EP = LatLng(21.479548546354152,-104.86580050068396) ////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(EP).title("Edificio P: edificios de aulas y Sala Audivisual para conferencias y reuniones y uno que otro torneo de smash"))

        val EEE = LatLng(21.479541058595572,-104.86545851903665) ////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(EEE).title("Edificio EE: oficinas del departamento de Extraescolares, los estudiante deben liberan sus creditos extracurriculares "))

        val EQ = LatLng(21.47958598528443,-104.86503473000452)  ////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(EQ).title("Edificio Q: Edificio de aulas de quimica aulas utilizadas las carreras de química y bioquímica"))

        val EG = LatLng(21.479393798912014,-104.8651205607142)   ////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(EG).title("Edificio G:Aulas para distintas materias como  administracion y contabilidad, estan equipadas con pantallas para uso de cualquier carrera "))

        val EG2 = LatLng(21.47925153095737,-104.86475980359837)  ////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(EG2).title("Edificio G:Aulas para distintas materias como  administracion y contabilidad, estan equipadas con pantallas para uso de cualquier carrera "))

        val EB = LatLng(21.47977817135869,-104.86576294974125) ////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(EB).title("Edificio B: Se utiliza para practicas"))

        val EB2 = LatLng(21.47991544695543,-104.86612102464684)   /////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(EB2).title("Edificio B: Laboratorios de quimica donde estudiantes de las carreras de bioquimica y quimica hacen practicas"))

        val BG = LatLng(21.48134317740582,-104.86469307003254)  /////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(BG).title("Baños Generales"))

        val CVP = LatLng(21.481597758414466,-104.86532338915677)  //////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(CVP).title("Cancha de voleibol playero"))

        val CBB = LatLng(21.48224169663628,-104.86507930813012)   ///////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(CBB).title("Cancha Béisbol"))

        val CM12 = LatLng(21.481747511754804,-104.86527510938805)   //////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(CM12).title("Canchas usos multiples"))

        val CFB1 = LatLng(21.48125409154352,-104.8641995436668)  ///////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(CFB1).title("Cancha Futbol"))

        val CFB4 = LatLng(21.481747511745894,-104.8656211143549)  //////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(CFB4).title("Cancha Futbol"))

        val CFB3 = LatLng(21.481793204211158,-104.86309983791708)   //////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(CFB3).title("Cancha Futbol"))

        val CFB2 = LatLng(21.481014485345185,-104.86348875824234)     //////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(CFB2).title("Cancha Futbol"))

        val DD = LatLng(21.48224169663628,-104.86507930813012)   /////
        Mapaa.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).anchor(0f,1f).position(DD).title("Domo polifuncional: Cancha de usos Multiples, tambien en ocaciones se realizan eventos"))

    }
}
