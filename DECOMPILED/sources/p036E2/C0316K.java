package p036E2;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.internal.ads.zzbuv;
import com.google.android.gms.internal.ads.zzdyb;
import com.google.android.gms.internal.ads.zzdzl;
import com.google.android.gms.internal.ads.zzgob;
import com.google.android.gms.internal.ads.zzgot;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: renamed from: E2.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0316K implements zzgob {

    /* JADX INFO: renamed from: a */
    private final Executor f1311a;

    /* JADX INFO: renamed from: b */
    private final zzdyb f1312b;

    public C0316K(Executor executor, zzdyb zzdybVar) {
        this.f1311a = executor;
        this.f1312b = zzdybVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* bridge */ /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
        final zzbuv zzbuvVar = (zzbuv) obj;
        return zzgot.zzj(this.f1312b.zza(zzbuvVar), new zzgob() { // from class: E2.J
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj2) {
                zzdzl zzdzlVar = (zzdzl) obj2;
                C0318M c0318m = new C0318M(new JsonReader(new InputStreamReader(zzdzlVar.zza())), zzdzlVar.zzb());
                zzbuv zzbuvVar2 = zzbuvVar;
                try {
                    c0318m.f1315b = C3244B.m17190a().m33298u(zzbuvVar2.zza).toString();
                } catch (JSONException unused) {
                    c0318m.f1315b = "{}";
                }
                Bundle bundle = zzbuvVar2.zzn;
                if (!bundle.isEmpty()) {
                    try {
                        c0318m.f1316c = C3244B.m17190a().m33298u(bundle).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return zzgot.zza(c0318m);
            }
        }, this.f1311a);
    }
}
