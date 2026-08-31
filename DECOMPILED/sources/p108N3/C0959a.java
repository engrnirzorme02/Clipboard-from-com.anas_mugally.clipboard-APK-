package p108N3;

import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zzcm;
import com.google.android.gms.internal.consent_sdk.zzcu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: N3.a */
/* JADX INFO: loaded from: classes2.dex */
public class C0959a {

    /* JADX INFO: renamed from: a */
    private final boolean f3692a;

    /* JADX INFO: renamed from: b */
    private final int f3693b;

    /* JADX INFO: renamed from: N3.a$a */
    public static class a {

        /* JADX INFO: renamed from: b */
        private final Context f3695b;

        /* JADX INFO: renamed from: d */
        private boolean f3697d;

        /* JADX INFO: renamed from: a */
        private final List f3694a = new ArrayList();

        /* JADX INFO: renamed from: c */
        private int f3696c = 0;

        public a(Context context) {
            this.f3695b = context.getApplicationContext();
        }

        /* JADX INFO: renamed from: a */
        public C0959a m4212a() {
            boolean z7 = true;
            if (!zzcu.zza(true) && !this.f3694a.contains(zzcm.zza(this.f3695b)) && !this.f3697d) {
                z7 = false;
            }
            return new C0959a(z7, this, null);
        }
    }

    /* synthetic */ C0959a(boolean z7, a aVar, AbstractC0968j abstractC0968j) {
        this.f3692a = z7;
        this.f3693b = aVar.f3696c;
    }

    /* JADX INFO: renamed from: a */
    public int m4209a() {
        return this.f3693b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m4210b() {
        return this.f3692a;
    }
}
