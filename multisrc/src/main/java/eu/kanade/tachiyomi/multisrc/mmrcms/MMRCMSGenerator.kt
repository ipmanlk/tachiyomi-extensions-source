package eu.kanade.tachiyomi.multisrc.mmrcms

import generator.ThemeSourceData.SingleLang
import generator.ThemeSourceGenerator

class MMRCMSGenerator : ThemeSourceGenerator {

    override val themePkg = "mmrcms"

    override val themeClass = "MMRCMS"

    override val baseVersionCode = 7

    override val sources = listOf(
        SingleLang("مانجا اون لاين", "https://onma.top", "ar", className = "onma"),
        SingleLang("Read Comics Online", "https://readcomicsonline.ru", "en"),
        SingleLang("Scan FR", "https://www.scan-fr.org", "fr", overrideVersionCode = 2),
        SingleLang("Scan VF", "https://www.scan-vf.net", "fr", overrideVersionCode = 1),
        SingleLang("Komikid", "https://www.komikid.com", "id"),
        SingleLang("Mangadoor", "https://mangadoor.com", "es", overrideVersionCode = 1),
        SingleLang("Mangas.in", "https://mangas.in", "es", isNsfw = true, className = "MangasIn", overrideVersionCode = 2),
        SingleLang("Utsukushii", "https://manga.utsukushii-bg.com", "bg", overrideVersionCode = 1),
        SingleLang("Phoenix-Scans", "https://phoenix-scans.pl", "pl", className = "PhoenixScans", overrideVersionCode = 1),
        SingleLang("Lelscan-VF", "https://lelscanvf.cc", "fr", className = "LelscanVF", overrideVersionCode = 2),
        SingleLang("MangaID", "https://mangaid.click", "id", overrideVersionCode = 1),
        SingleLang("Jpmangas", "https://jpmangas.xyz", "fr", overrideVersionCode = 2),
        SingleLang("Manga-FR", "https://manga-fr.cc", "fr", className = "MangaFR", overrideVersionCode = 2),
        SingleLang("Manga-Scan", "https://mangascan-fr.com", "fr", className = "MangaScan", overrideVersionCode = 4),
        SingleLang("Bentoscan", "https://bentoscan.com", "fr"),
        // NOTE: THIS SOURCE CONTAINS A CUSTOM LANGUAGE SYSTEM (which will be ignored)!
        SingleLang("HentaiShark", "https://www.hentaishark.com", "all", isNsfw = true),
    )

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            MMRCMSGenerator().createAll()
        }
    }
}
