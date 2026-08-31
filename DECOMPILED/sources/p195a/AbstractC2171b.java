package p195a;

/* JADX INFO: renamed from: a.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2171b {

    /* JADX INFO: renamed from: a */
    private static final String f7033a = "_COROUTINE";

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final StackTraceElement m8794b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f7033a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
