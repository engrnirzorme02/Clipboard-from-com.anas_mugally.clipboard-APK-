package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p173W5.InterfaceC1875e;
import p238e6.InterfaceC5367l;
import p346s0.C6943b;
import p346s0.C6944c;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2719u {

    /* JADX INFO: renamed from: a */
    public static final a f10656a = new a(null);

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.u$a */
    public static final class a {

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.u$a$a, reason: collision with other inner class name */
        static final class C7671a extends AbstractC6119o implements InterfaceC5367l {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Context f10657a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7671a(Context context) {
                super(1);
                this.f10657a = context;
            }

            @Override // p238e6.InterfaceC5367l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C2721w invoke(Context it) {
                AbstractC6118n.m27187e(it, "it");
                return new C2721w(this.f10657a);
            }
        }

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.u$a$b */
        static final class b extends AbstractC6119o implements InterfaceC5367l {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Context f10658a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context) {
                super(1);
                this.f10658a = context;
            }

            @Override // p238e6.InterfaceC5367l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C2722x invoke(Context it) {
                AbstractC6118n.m27187e(it, "it");
                return new C2722x(this.f10658a);
            }
        }

        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC2719u m12835a(Context context) {
            AbstractC6118n.m27187e(context, "context");
            C6943b c6943b = C6943b.f27895a;
            if (c6943b.m30415a() >= 11) {
                return new C2693A(context);
            }
            if (c6943b.m30415a() >= 5) {
                return new C2695C(context);
            }
            if (c6943b.m30415a() == 4) {
                return new C2694B(context);
            }
            if (c6943b.m30416b() >= 11) {
                return (AbstractC2719u) C6944c.f27898a.m30419a(context, "TopicsManager", new C7671a(context));
            }
            if (c6943b.m30416b() >= 9) {
                return (AbstractC2719u) C6944c.f27898a.m30419a(context, "TopicsManager", new b(context));
            }
            return null;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo12807a(C2700b c2700b, InterfaceC1875e interfaceC1875e);
}
