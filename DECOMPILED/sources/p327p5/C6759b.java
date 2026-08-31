package p327p5;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p173W5.InterfaceC1875e;
import p310n6.AbstractC6506c;
import p310n6.C6504a;
import p310n6.EnumC6507d;

/* JADX INFO: renamed from: p5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6759b implements InterfaceC6772o {

    /* JADX INFO: renamed from: b */
    private static final a f27139b = new a(null);

    /* JADX INFO: renamed from: a */
    private final Bundle f27140a;

    /* JADX INFO: renamed from: p5.b$a */
    private static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    public C6759b(Context appContext) {
        AbstractC6118n.m27187e(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.f27140a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // p327p5.InterfaceC6772o
    /* JADX INFO: renamed from: a */
    public Boolean mo29545a() {
        if (this.f27140a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f27140a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // p327p5.InterfaceC6772o
    /* JADX INFO: renamed from: b */
    public C6504a mo29546b() {
        if (this.f27140a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return C6504a.m27699d(AbstractC6506c.m27723h(this.f27140a.getInt("firebase_sessions_sessions_restart_timeout"), EnumC6507d.SECONDS));
        }
        return null;
    }

    @Override // p327p5.InterfaceC6772o
    /* JADX INFO: renamed from: c */
    public Double mo29547c() {
        if (this.f27140a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f27140a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // p327p5.InterfaceC6772o
    /* JADX INFO: renamed from: d */
    public Object mo29548d(InterfaceC1875e interfaceC1875e) {
        return InterfaceC6772o.a.m29605a(this, interfaceC1875e);
    }
}
