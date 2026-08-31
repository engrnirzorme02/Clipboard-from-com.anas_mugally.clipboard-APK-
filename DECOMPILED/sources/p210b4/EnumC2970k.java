package p210b4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: b4.k */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2970k implements Executor {
    INSTANCE;


    /* JADX INFO: renamed from: b */
    private static final Handler f12269b = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f12269b.post(runnable);
    }
}
