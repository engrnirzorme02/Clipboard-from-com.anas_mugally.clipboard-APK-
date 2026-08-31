package okhttp3;

/* JADX INFO: loaded from: classes.dex */
public interface Interceptor {

    public interface Chain {
        /* JADX INFO: renamed from: a */
        Response mo28558a(Request request);

        /* JADX INFO: renamed from: b */
        Request mo28559b();

        Call call();
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f25299a = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    Response mo14834a(Chain chain);
}
