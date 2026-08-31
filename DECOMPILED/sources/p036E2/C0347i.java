package p036E2;

import android.util.Pair;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzgoq;
import java.util.Objects;
import p314o2.EnumC6551c;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: E2.i */
/* JADX INFO: loaded from: classes.dex */
final class C0347i implements zzgoq {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BinderC0375w f1400a;

    C0347i(BinderC0375w binderC0375w) {
        Objects.requireNonNull(binderC0375w);
        this.f1400a = binderC0375w;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        C7351t.m32354l().zzg(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", EnumC6551c.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        BinderC0375w binderC0375w = this.f1400a;
        AbstractC0335c.m1523e(binderC0375w.m1578L0(), null, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(binderC0375w.m1592Z0().get())));
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33329d("Failed to initialize webview for loading SDKCore. ", th);
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzky)).booleanValue() || binderC0375w.m1591Y0().get()) {
            return;
        }
        if (binderC0375w.m1592Z0().getAndIncrement() < ((Integer) C3250D.m17200c().zzd(zzbci.zzkz)).intValue()) {
            binderC0375w.m1605y1();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33326a("Initialized webview successfully for SDKCore.");
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzky)).booleanValue()) {
            BinderC0375w binderC0375w = this.f1400a;
            AbstractC0335c.m1523e(binderC0375w.m1578L0(), null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", EnumC6551c.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(binderC0375w.m1592Z0().get())));
            binderC0375w.m1591Y0().set(true);
        }
    }
}
