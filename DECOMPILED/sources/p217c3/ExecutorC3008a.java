package p217c3;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzh;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c3.a */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorC3008a implements Executor {

    /* JADX INFO: renamed from: a */
    private final Handler f12431a;

    public ExecutorC3008a(Looper looper) {
        this.f12431a = new zzh(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f12431a.post(runnable);
    }
}
