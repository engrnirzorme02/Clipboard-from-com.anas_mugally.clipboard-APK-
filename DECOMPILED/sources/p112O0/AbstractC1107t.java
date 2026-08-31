package p112O0;

import android.content.Context;
import androidx.work.C2895a;
import java.util.Collections;
import java.util.List;
import p119P0.C1182i;

/* JADX INFO: renamed from: O0.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1107t {
    protected AbstractC1107t() {
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC1107t m4862d(Context context) {
        return C1182i.m5164k(context);
    }

    /* JADX INFO: renamed from: e */
    public static void m4863e(Context context, C2895a c2895a) {
        C1182i.m5162e(context, c2895a);
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC1100m mo4864a(String str);

    /* JADX INFO: renamed from: b */
    public final InterfaceC1100m m4865b(AbstractC1108u abstractC1108u) {
        return mo4866c(Collections.singletonList(abstractC1108u));
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC1100m mo4866c(List list);
}
