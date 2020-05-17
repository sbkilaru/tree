class Arraytotree(private val lst: ArrayList<relArray>) {
    private fun printLst (al:ArrayList<relArray>) {
        for (i in al ) { printItem(i) }
    }
    private fun printItem(i: relArray?) {
        println("Item = { ${i?.parent}, ${i?.child} }")
    }
    private fun findTop():relArray? {
        for (i in lst) { if (i.parent== i.child) return i }
        return null
    }
    private fun getLink(str: String?): ArrayList<relArray> {
        val l1 =  ArrayList<relArray>()
        if (str == null) return l1
        for (i in lst) { if ( (i.parent == str ) && (i.parent != i.child) ) l1.add(i) }
        return l1
    }
    private fun getChain(ln: ArrayList<relArray>) {
        for (i in ln) {
            val tl = getLink(i.child)
            if (tl.size > 0) {
                println("Under ${i.child} The following:"); printLst(tl);   getChain(tl)
            }
        }
    }
    fun getFromTop() {
        val i = findTop()
        if (i != null) {
            val tl = getLink(i.child)
            if (tl.size > 0) {
                println("Under ${i.child} The following:"); printLst(tl);   getChain(tl)
            }
        }
        else { println("Top not found")}
    }
}