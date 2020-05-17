fun main() {
    val lst = loadArray();  val att = Arraytotree(lst)
    att.getFromTop()
    }
fun loadArray(): ArrayList<relArray> {
    val lst =  ArrayList<relArray>()
    lst.add(relArray("Top","Top"))

    lst.add(relArray("Top","L21"));     lst.add(relArray("Top","L22"))
    lst.add(relArray("Top","L23"));     lst.add(relArray("Top","L24"))

    lst.add(relArray("L21","L211"));    lst.add(relArray("L21","L212"));    lst.add(relArray("L21","L213"))
    lst.add(relArray("L22","L221"));    lst.add(relArray("L22","L222"))
    lst.add(relArray("L23","L231"))

    lst.add(relArray("L211","L2111"));  lst.add(relArray("L211","L2112"));  lst.add(relArray("L211","L2113"))
    lst.add(relArray("L211","L2114"));  lst.add(relArray("L211","L2116"));  lst.add(relArray("L211","L2117"))
    lst.add(relArray("L222","L2221"));  lst.add(relArray("L222","L2222"));  lst.add(relArray("L222","L2223"))

    lst.add(relArray("L2112","L21121"))


    return lst
}