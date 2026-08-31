package p302m6;

/* JADX INFO: renamed from: m6.c */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC6401c extends AbstractC6400b {
    /* JADX INFO: renamed from: d */
    public static final boolean m27519d(char c7, char c8, boolean z7) {
        if (c7 == c8) {
            return true;
        }
        if (!z7) {
            return false;
        }
        char upperCase = Character.toUpperCase(c7);
        char upperCase2 = Character.toUpperCase(c8);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
