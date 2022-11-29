import java.util.*
import kotlin.collections.ArrayList

enum class Race {
    HURENSOHN, GEWÜRZGURKE, WEINTRAUBE
}
enum class Time {
    NACHT, TAG
}

var time = Time.TAG
var raabe = Raabe()
var user = ""
lateinit var race: Race
var karma = 0
var brotCounter = 1

fun scan(): String {
    val scan = Scanner(System.`in`)
    return scan.nextLine().toString().lowercase()
}


fun convertToRaces(input: String): Race {
    when(input) {
        "gewürzgurke" -> return Race.GEWÜRZGURKE
        "weintraube" -> return Race.WEINTRAUBE
        else -> return Race.HURENSOHN
    }
}

fun printRaces() {
    var tempValue = ""

    for (race in Race.values()) {
        tempValue = race.toString()
        tempValue = tempValue.lowercase()
        println(tempValue)
    }

}

fun nameModul() {
    println("*Du befindest dich im Gemüseland-Imperium, deine Aufgabe ist es zu deiner Mutter inmitten des Faschistischen Regimes zu kommen, da sie Schlawiners gebacken hat*")
    println(
        "Während du die großen Dängel begutachtest " +
                "kommt ein großer alter Waschbär auf dich zu und fragt mit erhobener Stimme: \n" +
                "'Wie ist denn ihr Name mein kleiner Schlingel?'"
    )
    println("-Gib dein Namen ein-")
    user = scan()
}

fun raceModul() {
    println(
        "'$user, das ist ja ein ungewöhnlicher Name, ich hoffe dein Schleummel Eumel ist Gesetzeskonform! " +
                "Ziehen Sie sich mal aus und zeigen ihn mal her'" +
                "\n *Er zeigt auf sein Abzeichen, auf dem das Symbol der " +
                "Gemüseschwadrone zu sehen ist.*"
    )
    println("-Gib eine der vorhandenen Rassen ein-")
    printRaces()
    race = convertToRaces(scan())

    when(race) {
        Race.HURENSOHN -> println("'Ein Hurensohn also, sehr bemerkenswerter Schleumel Eumel... \nSie dürfen in den Wald meine Hoheit!'")
        Race.WEINTRAUBE -> println("'EINE FRUCHT! Wie können Sie es wagen zu existieren, Ihr Schleumel Eumel ist unzumutbar' \n*Der Waschbär schreit nach Hilfe, während du über die Plaza zum nächsten Wald läufst*")
        Race.GEWÜRZGURKE -> println("'Aha eine Gewürzgurke also, fein fein. Nun gut nichts besonderes, aber trotzdem toller Schleumel Eumel. \n Sie können sich wieder anziehen und in den Wald gehen!'")
    }
}

fun homelessModul() {
    if (race == Race.WEINTRAUBE) {
        println("*Verschwitzt kommst du in den Wald gerannt*")
    }
    println("*Du schaust dich um und siehst ein obdachlosen Pilz, der neben einem alten Baum sitzt." +
            " \nEin schauriges Gefühl überkommt dich, als du sein abgemagerten Bauch siehst." +
            "\nDir fällt ein, dass du noch ein stück Brot im Hosenboden hast*")
    println("-Gibst du dem Pilz dein letztes Brot?-")
    if (scan().equals("ja")) {
        brotCounter -= 1
        karma += 1
        println("*Der Pilz wacht auf und grinst dich mit einem traurigen Lächeln an*")
        println("'Ich hab schon seit einer Woche nichts mehr gegessen, das bedeutet mir viel, seitdem ich mein Kind verloren hab bin ich schon obdachlos, \nwenig Menschen geben einem ihr letztes Brot'")
    } else {
        println("*Du gehst an ihm vorbei, zwar hast du jetzt noch dein Brot, ein schlechtes Gewissen jedoch auch*")
    }
}

fun naziModul() {
    println("*Du schlenderst durch den dunklen Wald, auf einmal kriecht der Geruch von toten Waschbären in deine Nase*")
    println("*Während du dein Würgereiz unterdrückst fällt dir ein, dass es in der Umgebung vor kurzem eine blutige Schlacht gegeben hat*")
    println("*Ein Schauer läuft dir den Rücker runter, instinktiv duckst du dich hinter einem Baum und hälst die Luft an*")
    println("*Eine Weile passiert nichts und du fragst dich, ob du aufstehen sollst*")
    println("-Stehst du auf?-")

    var temp = scan()
    if (temp.equals("ja") && race == Race.WEINTRAUBE) {
        println("*Du stehst langsam auf und merkst direkt, dass es ein Fehler war*")
        println("Seht, eine Weintraube in den dunklen Wälder, PACKT IHN! *Schreit ein Offizier in einer Gemüseuniform, 50 Meter entfernt*")
        println("*Hastisch rennst du durch den Wald, gefolgt von einem halben Dutzend Waschbären*")
        raabe.printRaetsel()
        raabe.checkLoesung(scan())
    }
    if (temp.equals("ja") && race != Race.WEINTRAUBE) {
        println("*Du stehst langsam auf und merkst direkt, dass es ein Fehler war*")
        println("*Ein Offizier der Gemüsegarde erblickt dich und schreitet auf dich zu*")
        println("*Du hast zwar Angst, aber da du ein $race bist sollte ja nichts passieren*")
        println("*Der Waschbär schaut dich mit einem argwönischen Blick an. Nach einer kurzen Zeit fragt er: *")
        println("'Haben Sie in letzter Zeit obdachlose Pilze gesehen? Für jeden obdachlosen Pilz zahlen wir ein Brot!'")
        println("-Entscheide dich, willst du den obdachlosen Pilz für ein Brot verraten?-")
        if (scan().equals("ja")) {
            brotCounter += 1
            karma -= 1
            println("'In Richtung Süden lag einer an einem Baum'")
            println("*Der Offizier nickt, gibt dir das Brot und geht mit der Kompanie in Richtung des Pilzes*")
            println("*Während du weitergehst hörst du die entfernten Schreie des Pilzes*")
        } else {
            karma += 1
            println("'Leider nicht Herr Offizier'")
            println("*Der Waschbär mustert dich mit einem unangenehmen Blick*")
            println("*Sie sollten Sich hier nicht aufhalten als $race ist es nicht sicher*")
            println("*Der Offizier nickt grimmig und du gehst deiner Wege*")
        }
    } else {
        println("*Du kauerst auf den Boden und wartest*")
        println("*Müdigkeit überkommt dich, du kämpfst zwar gegen an, jedoch kannst du es nicht unterdrücken*")
        time = Time.NACHT
        println("*Als du aufwachst ist es schon stockdüster und du merkst wie sehr du Appetit auf Schlawiners hast*")
        println("*Du richtest dich auf und versuchst dich anhand des Mondes zu orientieren*")
        raabe.printRaetsel()
        if (raabe.checkLoesung(scan())) {
            println("'Du hast das Rätsel verkackt du kek'")
        } else {
            println("'Du bist ein junger Gott und fühlst dich papatastisch'")
        }
    }
}

fun hauptstadtText() {
    println("-------------------------------------")
    nameModul()
    raceModul()
}

fun waldText() {
    println("-------------------------------------")
    homelessModul()
    naziModul()
}

fun main(args: Array<String>) {
    hauptstadtText()
    waldText()

}

