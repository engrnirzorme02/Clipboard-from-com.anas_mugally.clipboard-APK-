package okhttp3.internal.concurrent;

import com.google.android.gms.internal.ads.zzbbn;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6103F;

/* JADX INFO: loaded from: classes.dex */
public final class TaskLoggerKt {
    /* JADX INFO: renamed from: b */
    public static final String m28891b(long j7) {
        String str;
        if (j7 <= -999500000) {
            str = ((j7 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j7 <= -999500) {
            str = ((j7 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j7 <= 0) {
            str = ((j7 - ((long) 500)) / ((long) zzbbn.zzq.zzf)) + " µs";
        } else if (j7 < 999500) {
            str = ((j7 + ((long) 500)) / ((long) zzbbn.zzq.zzf)) + " µs";
        } else if (j7 < 999500000) {
            str = ((j7 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j7 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        C6103F c6103f = C6103F.f23863a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        AbstractC6118n.m27186d(str2, "format(format, *args)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m28892c(Task task, TaskQueue taskQueue, String str) {
        Logger loggerM28920a = TaskRunner.f25605h.m28920a();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.m28899f());
        sb.append(' ');
        C6103F c6103f = C6103F.f23863a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        AbstractC6118n.m27186d(str2, "format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(task.m28885b());
        loggerM28920a.fine(sb.toString());
    }
}
