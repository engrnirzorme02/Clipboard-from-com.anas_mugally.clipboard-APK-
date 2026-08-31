package p163V2;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: V2.A */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1722A {

    /* JADX INFO: renamed from: a */
    final int f5723a;

    /* JADX INFO: renamed from: b */
    final TaskCompletionSource f5724b = new TaskCompletionSource();

    /* JADX INFO: renamed from: c */
    final int f5725c;

    /* JADX INFO: renamed from: d */
    final Bundle f5726d;

    AbstractC1722A(int i7, int i8, Bundle bundle) {
        this.f5723a = i7;
        this.f5725c = i8;
        this.f5726d = bundle;
    }

    /* JADX INFO: renamed from: a */
    abstract void mo7338a(Bundle bundle);

    /* JADX INFO: renamed from: b */
    abstract boolean mo7339b();

    /* JADX INFO: renamed from: c */
    final void m7340c(C1723B c1723b) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + c1723b.toString());
        }
        this.f5724b.setException(c1723b);
    }

    /* JADX INFO: renamed from: d */
    final void m7341d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.f5724b.setResult(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f5725c + " id=" + this.f5723a + " oneWay=" + mo7339b() + "}";
    }
}
