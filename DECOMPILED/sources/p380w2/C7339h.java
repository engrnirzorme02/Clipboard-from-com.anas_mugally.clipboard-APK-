package p380w2;

import com.google.android.gms.internal.ads.zzfpf;
import java.util.Objects;

/* JADX INFO: renamed from: w2.h */
/* JADX INFO: loaded from: classes.dex */
final class C7339h implements zzfpf {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ RunnableC7342k f29199a;

    C7339h(RunnableC7342k runnableC7342k) {
        Objects.requireNonNull(runnableC7342k);
        this.f29199a = runnableC7342k;
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final void zza(int i7, long j7) {
        this.f29199a.m32324f().zzb(i7, System.currentTimeMillis() - j7);
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final void zzb(int i7, long j7, String str) {
        this.f29199a.m32324f().zzf(i7, System.currentTimeMillis() - j7, str);
    }
}
