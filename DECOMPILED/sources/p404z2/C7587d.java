package p404z2;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: renamed from: z2.d */
/* JADX INFO: loaded from: classes.dex */
final class C7587d extends Thread {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f30235a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f30236b;

    C7587d(C7590g c7590g, Context context, String str) {
        this.f30235a = context;
        this.f30236b = str;
        Objects.requireNonNull(c7590g);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new C7605v(this.f30235a, null).zza(this.f30236b);
    }
}
