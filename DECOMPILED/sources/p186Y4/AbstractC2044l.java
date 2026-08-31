package p186Y4;

import android.os.AsyncTask;
import androidx.privacysandbox.ads.adservices.measurement.ExecutorC2688k;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: Y4.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2044l {

    /* JADX INFO: renamed from: a */
    public static final Executor f6762a = TaskExecutors.MAIN_THREAD;

    /* JADX INFO: renamed from: b */
    public static final Executor f6763b = new ExecutorC2688k();

    /* JADX INFO: renamed from: c */
    public static final Executor f6764c = new ExecutorC2054v(4, AsyncTask.THREAD_POOL_EXECUTOR);
}
