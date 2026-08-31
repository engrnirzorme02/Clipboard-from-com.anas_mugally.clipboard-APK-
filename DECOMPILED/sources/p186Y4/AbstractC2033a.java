package p186Y4;

/* JADX INFO: renamed from: Y4.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2033a {
    /* JADX INFO: renamed from: a */
    public static AssertionError m8456a(String str, Throwable th) {
        AssertionError assertionError = new AssertionError(str);
        assertionError.initCause(th);
        return assertionError;
    }
}
