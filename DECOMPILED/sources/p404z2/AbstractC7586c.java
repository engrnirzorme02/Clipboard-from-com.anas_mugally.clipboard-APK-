package p404z2;

import com.google.android.gms.common.api.C3553a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: z2.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7586c {

    /* JADX INFO: renamed from: a */
    public static final ThreadPoolExecutor f30233a = new ThreadPoolExecutor(2, C3553a.e.API_PRIORITY_OTHER, 10, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC7585b("ClientDefault"));

    /* JADX INFO: renamed from: b */
    public static final ExecutorService f30234b = Executors.newSingleThreadExecutor(new ThreadFactoryC7585b("ClientSingle"));
}
