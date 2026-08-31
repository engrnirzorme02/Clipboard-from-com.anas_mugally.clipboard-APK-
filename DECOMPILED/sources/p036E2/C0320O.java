package p036E2;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.internal.ads.zzdel;

/* JADX INFO: renamed from: E2.O */
/* JADX INFO: loaded from: classes.dex */
public final class C0320O implements zzdel {

    /* JADX INFO: renamed from: a */
    private final C0308C f1324a;

    /* JADX INFO: renamed from: b */
    private final int f1325b;

    /* JADX INFO: renamed from: c */
    private final String f1326c;

    public C0320O(C0308C c0308c, int i7, String str) {
        this.f1324a = c0308c;
        this.f1325b = i7;
        this.f1326c = str;
    }

    /* JADX INFO: renamed from: a */
    final /* synthetic */ void m1496a(C0318M c0318m) {
        this.f1324a.m1485a(this.f1326c, c0318m);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzd(final C0318M c0318m) {
        if (c0318m == null || this.f1325b != 2 || TextUtils.isEmpty(this.f1326c)) {
            return;
        }
        C3431F0.m17396R(new Runnable() { // from class: E2.N
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f1322a.m1496a(c0318m);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zze(String str) {
    }
}
