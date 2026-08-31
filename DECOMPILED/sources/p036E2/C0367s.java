package p036E2;

import com.google.android.gms.internal.ads.zzggr;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: E2.s */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class C0367s implements zzggr {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ C0367s f1457a = new C0367s();

    private /* synthetic */ C0367s() {
    }

    @Override // com.google.android.gms.internal.ads.zzggr
    public final /* synthetic */ Object apply(Object obj) {
        List list = BinderC0375w.f1478R;
        return ((JSONObject) obj).optString("nas");
    }
}
