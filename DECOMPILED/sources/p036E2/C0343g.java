package p036E2;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzgoq;
import java.util.ArrayList;
import java.util.Objects;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: E2.g */
/* JADX INFO: loaded from: classes.dex */
final class C0343g implements zzgoq {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ zzbtl f1389a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f1390b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ BinderC0375w f1391c;

    C0343g(BinderC0375w binderC0375w, zzbtl zzbtlVar, boolean z7) {
        this.f1389a = zzbtlVar;
        this.f1390b = z7;
        Objects.requireNonNull(binderC0375w);
        this.f1391c = binderC0375w;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        try {
            zzbtl zzbtlVar = this.f1389a;
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
        ArrayList<Uri> arrayList = (ArrayList) obj;
        try {
            this.f1389a.zze(arrayList);
            BinderC0375w binderC0375w = this.f1391c;
            if (!binderC0375w.m1580N0() && !this.f1390b) {
                return;
            }
            for (Uri uri : arrayList) {
                if (binderC0375w.m1593m1(uri)) {
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
