package androidx.lifecycle;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p010B0.AbstractC0044c;
import p010B0.C0047f;
import p288l0.C6133b;

/* JADX INFO: renamed from: androidx.lifecycle.K */
/* JADX INFO: loaded from: classes.dex */
public final class C2619K {

    /* JADX INFO: renamed from: c */
    public static final a f10409c = new a(null);

    /* JADX INFO: renamed from: a */
    private final Map f10410a;

    /* JADX INFO: renamed from: b */
    private C6133b f10411b;

    /* JADX INFO: renamed from: androidx.lifecycle.K$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C2619K m12553a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new C2619K();
            }
            ClassLoader classLoader = C2619K.class.getClassLoader();
            AbstractC6118n.m27184b(classLoader);
            bundle.setClassLoader(classLoader);
            return new C2619K(AbstractC0044c.m182g(AbstractC0044c.m176a(bundle)));
        }

        private a() {
        }
    }

    public C2619K(Map initialState) {
        AbstractC6118n.m27187e(initialState, "initialState");
        this.f10410a = new LinkedHashMap();
        this.f10411b = new C6133b(initialState);
    }

    /* JADX INFO: renamed from: a */
    public final C0047f.b m12552a() {
        return this.f10411b.m27201b();
    }

    public C2619K() {
        this.f10410a = new LinkedHashMap();
        this.f10411b = new C6133b(null, 1, null);
    }
}
