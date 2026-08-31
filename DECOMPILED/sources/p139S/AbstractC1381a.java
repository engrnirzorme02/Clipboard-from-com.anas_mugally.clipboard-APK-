package p139S;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.common.api.C3553a;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1617O;

/* JADX INFO: renamed from: S.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1381a {

    /* JADX INFO: renamed from: a */
    public static final a f4881a = new a(null);

    /* JADX INFO: renamed from: b */
    private static final Set f4882b = AbstractC1617O.m6652f(7, 20);

    /* JADX INFO: renamed from: c */
    private static final int f4883c = 1;

    /* JADX INFO: renamed from: S.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m5945a() {
            return AbstractC1381a.f4883c;
        }

        /* JADX INFO: renamed from: b */
        public final Set m5946b() {
            return AbstractC1381a.f4882b;
        }

        /* JADX INFO: renamed from: c */
        public final void m5947c(ResultReceiver resultReceiver, String errName, String errMsg) {
            AbstractC6118n.m27187e(resultReceiver, "<this>");
            AbstractC6118n.m27187e(errName, "errName");
            AbstractC6118n.m27187e(errMsg, "errMsg");
            Bundle bundle = new Bundle();
            bundle.putBoolean("FAILURE_RESPONSE", true);
            bundle.putString("EXCEPTION_TYPE", errName);
            bundle.putString("EXCEPTION_MESSAGE", errMsg);
            resultReceiver.send(C3553a.e.API_PRIORITY_OTHER, bundle);
        }

        /* JADX INFO: renamed from: d */
        public final void m5948d(ResultReceiver resultReceiver, int i7, int i8, Intent intent) {
            AbstractC6118n.m27187e(resultReceiver, "<this>");
            Bundle bundle = new Bundle();
            bundle.putBoolean("FAILURE_RESPONSE", false);
            bundle.putInt("ACTIVITY_REQUEST_CODE", i7);
            bundle.putParcelable("RESULT_DATA", intent);
            resultReceiver.send(i8, bundle);
        }

        private a() {
        }
    }
}
