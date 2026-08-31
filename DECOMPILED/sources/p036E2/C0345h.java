package p036E2;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzgoq;
import java.util.List;
import java.util.Objects;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: E2.h */
/* JADX INFO: loaded from: classes.dex */
final class C0345h implements zzgoq {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ zzbtl f1395a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f1396b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ BinderC0375w f1397c;

    C0345h(BinderC0375w binderC0375w, zzbtl zzbtlVar, boolean z7) {
        this.f1395a = zzbtlVar;
        this.f1396b = z7;
        Objects.requireNonNull(binderC0375w);
        this.f1397c = binderC0375w;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        try {
            zzbtl zzbtlVar = this.f1395a;
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
            sb.append("Internal error: ");
            sb.append(message);
            zzbtlVar.zzf(sb.toString());
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<Uri> list = (List) obj;
        try {
            BinderC0375w binderC0375w = this.f1397c;
            binderC0375w.m1604x1(list);
            this.f1395a.zze(list);
            if (!binderC0375w.m1581O0() && !this.f1396b) {
                return;
            }
            for (Uri uri : list) {
                if (binderC0375w.m1594n1(uri)) {
                    binderC0375w.m1579M0().zzb(BinderC0375w.m1574k1(uri, binderC0375w.m1590X0(), "1").toString(), null, null, null);
                } else {
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhT)).booleanValue()) {
                        binderC0375w.m1579M0().zzb(uri.toString(), null, null, null);
                    }
                }
            }
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("", e7);
        }
    }
}
