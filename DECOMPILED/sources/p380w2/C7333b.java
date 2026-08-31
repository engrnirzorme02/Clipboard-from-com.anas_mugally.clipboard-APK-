package p380w2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.internal.ads.zzbud;
import com.google.android.gms.internal.ads.zzbxf;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: w2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7333b {

    /* JADX INFO: renamed from: a */
    private final Context f29187a;

    /* JADX INFO: renamed from: b */
    private boolean f29188b;

    /* JADX INFO: renamed from: c */
    private final zzbxf f29189c;

    /* JADX INFO: renamed from: d */
    private final zzbud f29190d = new zzbud(false, Collections.EMPTY_LIST);

    public C7333b(Context context, zzbxf zzbxfVar, zzbud zzbudVar) {
        this.f29187a = context;
        this.f29189c = zzbxfVar;
    }

    /* JADX INFO: renamed from: d */
    private final boolean m32304d() {
        zzbxf zzbxfVar = this.f29189c;
        return (zzbxfVar != null && zzbxfVar.zza().zzf) || this.f29190d.zza;
    }

    /* JADX INFO: renamed from: a */
    public final void m32305a() {
        this.f29188b = true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m32306b() {
        return !m32304d() || this.f29188b;
    }

    /* JADX INFO: renamed from: c */
    public final void m32307c(String str) {
        List<String> list;
        if (m32304d()) {
            if (str == null) {
                str = "";
            }
            zzbxf zzbxfVar = this.f29189c;
            if (zzbxfVar != null) {
                zzbxfVar.zze(str, null, 3);
                return;
            }
            zzbud zzbudVar = this.f29190d;
            if (!zzbudVar.zza || (list = zzbudVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.f29187a;
                    C7351t.m32349g();
                    C3431F0.m17425p(context, "", strReplace);
                }
            }
        }
    }
}
