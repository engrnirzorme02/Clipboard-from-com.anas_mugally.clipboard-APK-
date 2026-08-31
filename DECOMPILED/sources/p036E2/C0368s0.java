package p036E2;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzdel;
import com.google.android.gms.internal.ads.zzdsg;
import org.json.JSONException;
import org.json.JSONObject;
import p380w2.C7351t;

/* JADX INFO: renamed from: E2.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0368s0 implements zzdel {

    /* JADX INFO: renamed from: a */
    private final zzdsg f1458a;

    /* JADX INFO: renamed from: b */
    private final C0366r0 f1459b;

    /* JADX INFO: renamed from: c */
    private final String f1460c;

    /* JADX INFO: renamed from: d */
    private final int f1461d;

    public C0368s0(zzdsg zzdsgVar, C0366r0 c0366r0, String str, int i7) {
        this.f1458a = zzdsgVar;
        this.f1459b = c0366r0;
        this.f1460c = str;
        this.f1461d = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzd(C0318M c0318m) {
        String strOptString;
        if (c0318m == null || this.f1461d == 2) {
            return;
        }
        if (TextUtils.isEmpty(c0318m.f1316c)) {
            this.f1459b.m1554a(this.f1460c, c0318m.f1315b, this.f1458a);
            return;
        }
        try {
            strOptString = new JSONObject(c0318m.f1316c).optString("request_id");
        } catch (JSONException e7) {
            C7351t.m32354l().zzg(e7, "RenderSignals.getRequestId");
            strOptString = null;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.f1459b.m1554a(strOptString, c0318m.f1316c, this.f1458a);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zze(String str) {
    }
}
