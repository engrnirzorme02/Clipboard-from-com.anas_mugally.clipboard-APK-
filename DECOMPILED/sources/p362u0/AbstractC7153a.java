package p362u0;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.measurement.AbstractC2678a;
import androidx.privacysandbox.ads.adservices.measurement.AbstractC2679b;
import androidx.privacysandbox.ads.adservices.measurement.AbstractC2690m;
import androidx.privacysandbox.ads.adservices.measurement.AbstractC2691n;
import androidx.privacysandbox.ads.adservices.measurement.AbstractC2692o;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p157U3.InterfaceFutureC1673e;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;
import p354t0.AbstractC7069b;

/* JADX INFO: renamed from: u0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7153a {

    /* JADX INFO: renamed from: a */
    public static final b f28547a = new b(null);

    /* JADX INFO: renamed from: u0.a$a */
    private static final class a extends AbstractC7153a {

        /* JADX INFO: renamed from: b */
        private final AbstractC2679b f28548b;

        /* JADX INFO: renamed from: u0.a$a$a, reason: collision with other inner class name */
        static final class C7726a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f28549a;

            C7726a(AbstractC2678a abstractC2678a, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return a.this.new C7726a(null, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((C7726a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                Object objE = AbstractC2005b.m8369e();
                int i7 = this.f28549a;
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    AbstractC2679b abstractC2679b = a.this.f28548b;
                    this.f28549a = 1;
                    if (abstractC2679b.mo12776a(null, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
                return C1444v.f4971a;
            }
        }

        /* JADX INFO: renamed from: u0.a$a$b */
        static final class b extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f28551a;

            b(InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return a.this.new b(interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                Object objE = AbstractC2005b.m8369e();
                int i7 = this.f28551a;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                    return obj;
                }
                AbstractC1437o.m6082b(obj);
                AbstractC2679b abstractC2679b = a.this.f28548b;
                this.f28551a = 1;
                Object objMo12777b = abstractC2679b.mo12777b(this);
                return objMo12777b == objE ? objE : objMo12777b;
            }
        }

        /* JADX INFO: renamed from: u0.a$a$c */
        static final class c extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f28553a;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Uri f28555c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ InputEvent f28556d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f28555c = uri;
                this.f28556d = inputEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return a.this.new c(this.f28555c, this.f28556d, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((c) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                Object objE = AbstractC2005b.m8369e();
                int i7 = this.f28553a;
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    AbstractC2679b abstractC2679b = a.this.f28548b;
                    Uri uri = this.f28555c;
                    InputEvent inputEvent = this.f28556d;
                    this.f28553a = 1;
                    if (abstractC2679b.mo12778c(uri, inputEvent, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
                return C1444v.f4971a;
            }
        }

        /* JADX INFO: renamed from: u0.a$a$d */
        static final class d extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f28557a;

            d(AbstractC2690m abstractC2690m, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return a.this.new d(null, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((d) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                Object objE = AbstractC2005b.m8369e();
                int i7 = this.f28557a;
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    AbstractC2679b abstractC2679b = a.this.f28548b;
                    this.f28557a = 1;
                    if (abstractC2679b.mo12779d(null, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
                return C1444v.f4971a;
            }
        }

        /* JADX INFO: renamed from: u0.a$a$e */
        static final class e extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f28559a;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Uri f28561c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(Uri uri, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f28561c = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return a.this.new e(this.f28561c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((e) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                Object objE = AbstractC2005b.m8369e();
                int i7 = this.f28559a;
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    AbstractC2679b abstractC2679b = a.this.f28548b;
                    Uri uri = this.f28561c;
                    this.f28559a = 1;
                    if (abstractC2679b.mo12780e(uri, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
                return C1444v.f4971a;
            }
        }

        /* JADX INFO: renamed from: u0.a$a$f */
        static final class f extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f28562a;

            f(AbstractC2691n abstractC2691n, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return a.this.new f(null, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((f) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                Object objE = AbstractC2005b.m8369e();
                int i7 = this.f28562a;
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    AbstractC2679b abstractC2679b = a.this.f28548b;
                    this.f28562a = 1;
                    if (abstractC2679b.mo12781f(null, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
                return C1444v.f4971a;
            }
        }

        /* JADX INFO: renamed from: u0.a$a$g */
        static final class g extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f28564a;

            g(AbstractC2692o abstractC2692o, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return a.this.new g(null, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((g) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                Object objE = AbstractC2005b.m8369e();
                int i7 = this.f28564a;
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    AbstractC2679b abstractC2679b = a.this.f28548b;
                    this.f28564a = 1;
                    if (abstractC2679b.mo12782g(null, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
                return C1444v.f4971a;
            }
        }

        public a(AbstractC2679b mMeasurementManager) {
            AbstractC6118n.m27187e(mMeasurementManager, "mMeasurementManager");
            this.f28548b = mMeasurementManager;
        }

        @Override // p362u0.AbstractC7153a
        /* JADX INFO: renamed from: b */
        public InterfaceFutureC1673e mo31622b() {
            return AbstractC7069b.m31167c(AbstractC6672k.m28225b(AbstractC6626O.m28098a(C6656c0.m28162a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // p362u0.AbstractC7153a
        /* JADX INFO: renamed from: c */
        public InterfaceFutureC1673e mo31623c(Uri attributionSource, InputEvent inputEvent) {
            AbstractC6118n.m27187e(attributionSource, "attributionSource");
            return AbstractC7069b.m31167c(AbstractC6672k.m28225b(AbstractC6626O.m28098a(C6656c0.m28162a()), null, null, new c(attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        @Override // p362u0.AbstractC7153a
        /* JADX INFO: renamed from: d */
        public InterfaceFutureC1673e mo31624d(Uri trigger) {
            AbstractC6118n.m27187e(trigger, "trigger");
            return AbstractC7069b.m31167c(AbstractC6672k.m28225b(AbstractC6626O.m28098a(C6656c0.m28162a()), null, null, new e(trigger, null), 3, null), null, 1, null);
        }

        /* JADX INFO: renamed from: f */
        public InterfaceFutureC1673e m31626f(AbstractC2678a deletionRequest) {
            AbstractC6118n.m27187e(deletionRequest, "deletionRequest");
            return AbstractC7069b.m31167c(AbstractC6672k.m28225b(AbstractC6626O.m28098a(C6656c0.m28162a()), null, null, new C7726a(deletionRequest, null), 3, null), null, 1, null);
        }

        /* JADX INFO: renamed from: g */
        public InterfaceFutureC1673e m31627g(AbstractC2690m request) {
            AbstractC6118n.m27187e(request, "request");
            return AbstractC7069b.m31167c(AbstractC6672k.m28225b(AbstractC6626O.m28098a(C6656c0.m28162a()), null, null, new d(request, null), 3, null), null, 1, null);
        }

        /* JADX INFO: renamed from: h */
        public InterfaceFutureC1673e m31628h(AbstractC2691n request) {
            AbstractC6118n.m27187e(request, "request");
            return AbstractC7069b.m31167c(AbstractC6672k.m28225b(AbstractC6626O.m28098a(C6656c0.m28162a()), null, null, new f(request, null), 3, null), null, 1, null);
        }

        /* JADX INFO: renamed from: i */
        public InterfaceFutureC1673e m31629i(AbstractC2692o request) {
            AbstractC6118n.m27187e(request, "request");
            return AbstractC7069b.m31167c(AbstractC6672k.m28225b(AbstractC6626O.m28098a(C6656c0.m28162a()), null, null, new g(request, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: u0.a$b */
    public static final class b {
        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC7153a m31637a(Context context) {
            AbstractC6118n.m27187e(context, "context");
            AbstractC2679b abstractC2679bM12783a = AbstractC2679b.f10631a.m12783a(context);
            if (abstractC2679bM12783a != null) {
                return new a(abstractC2679bM12783a);
            }
            return null;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC7153a m31621a(Context context) {
        return f28547a.m31637a(context);
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceFutureC1673e mo31622b();

    /* JADX INFO: renamed from: c */
    public abstract InterfaceFutureC1673e mo31623c(Uri uri, InputEvent inputEvent);

    /* JADX INFO: renamed from: d */
    public abstract InterfaceFutureC1673e mo31624d(Uri uri);
}
