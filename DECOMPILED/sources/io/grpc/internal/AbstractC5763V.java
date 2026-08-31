package io.grpc.internal;

import java.nio.charset.Charset;
import p063H5.AbstractC0518M;
import p063H5.AbstractC0520O;
import p063H5.C0530Z;
import p063H5.C0554l0;
import p122P3.AbstractC1199c;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5763V extends AbstractC5770a.c {

    /* JADX INFO: renamed from: w */
    private static final AbstractC0518M.a f22314w;

    /* JADX INFO: renamed from: x */
    private static final C0530Z.g f22315x;

    /* JADX INFO: renamed from: s */
    private C0554l0 f22316s;

    /* JADX INFO: renamed from: t */
    private C0530Z f22317t;

    /* JADX INFO: renamed from: u */
    private Charset f22318u;

    /* JADX INFO: renamed from: v */
    private boolean f22319v;

    /* JADX INFO: renamed from: io.grpc.internal.V$a */
    class a implements AbstractC0518M.a {
        a() {
        }

        @Override // p063H5.C0530Z.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer mo2310b(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
            }
            throw new NumberFormatException("Malformed status code " + new String(bArr, AbstractC0518M.f1937a));
        }

        @Override // p063H5.C0530Z.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] mo2309a(Integer num) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        a aVar = new a();
        f22314w = aVar;
        f22315x = AbstractC0518M.m2168b(":status", aVar);
    }

    protected AbstractC5763V(int i7, C5751O0 c5751o0, C5762U0 c5762u0) {
        super(i7, c5751o0, c5762u0);
        this.f22318u = AbstractC1199c.f4279c;
    }

    /* JADX INFO: renamed from: O */
    private static Charset m25742O(C0530Z c0530z) {
        String str = (String) c0530z.m2283g(AbstractC5757S.f22234j);
        if (str != null) {
            String[] strArrSplit = str.split("charset=", 2);
            try {
                return Charset.forName(strArrSplit[strArrSplit.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return AbstractC1199c.f4279c;
    }

    /* JADX INFO: renamed from: Q */
    private C0554l0 m25743Q(C0530Z c0530z) {
        C0554l0 c0554l0 = (C0554l0) c0530z.m2283g(AbstractC0520O.f1940b);
        if (c0554l0 != null) {
            return c0554l0.m2462q((String) c0530z.m2283g(AbstractC0520O.f1939a));
        }
        if (this.f22319v) {
            return C0554l0.f2100g.m2462q("missing GRPC status in response");
        }
        Integer num = (Integer) c0530z.m2283g(f22315x);
        return (num != null ? AbstractC5757S.m25675m(num.intValue()) : C0554l0.f2112s.m2462q("missing HTTP status code")).m2456e("missing GRPC status, inferred error from HTTP status code");
    }

    /* JADX INFO: renamed from: R */
    private static void m25744R(C0530Z c0530z) {
        c0530z.m2282e(f22315x);
        c0530z.m2282e(AbstractC0520O.f1940b);
        c0530z.m2282e(AbstractC0520O.f1939a);
    }

    /* JADX INFO: renamed from: V */
    private C0554l0 m25745V(C0530Z c0530z) {
        Integer num = (Integer) c0530z.m2283g(f22315x);
        if (num == null) {
            return C0554l0.f2112s.m2462q("Missing HTTP status code");
        }
        String str = (String) c0530z.m2283g(AbstractC5757S.f22234j);
        if (AbstractC5757S.m25676n(str)) {
            return null;
        }
        return AbstractC5757S.m25675m(num.intValue()).m2456e("invalid content-type: " + str);
    }

    /* JADX INFO: renamed from: P */
    protected abstract void mo3279P(C0554l0 c0554l0, boolean z7, C0530Z c0530z);

    /* JADX INFO: renamed from: S */
    protected void m25746S(InterfaceC5819y0 interfaceC5819y0, boolean z7) throws Throwable {
        C0554l0 c0554l0 = this.f22316s;
        if (c0554l0 != null) {
            this.f22316s = c0554l0.m2456e("DATA-----------------------------\n" + AbstractC5821z0.m26221e(interfaceC5819y0, this.f22318u));
            interfaceC5819y0.close();
            if (this.f22316s.m2459n().length() > 1000 || z7) {
                mo3279P(this.f22316s, false, this.f22317t);
                return;
            }
            return;
        }
        if (!this.f22319v) {
            mo3279P(C0554l0.f2112s.m2462q("headers not received before payload"), false, new C0530Z());
            return;
        }
        int iMo3397e = interfaceC5819y0.mo3397e();
        m25837D(interfaceC5819y0);
        if (z7) {
            if (iMo3397e > 0) {
                this.f22316s = C0554l0.f2112s.m2462q("Received unexpected EOS on non-empty DATA frame from server");
            } else {
                this.f22316s = C0554l0.f2112s.m2462q("Received unexpected EOS on empty DATA frame from server");
            }
            C0530Z c0530z = new C0530Z();
            this.f22317t = c0530z;
            m25844N(this.f22316s, false, c0530z);
        }
    }

    /* JADX INFO: renamed from: T */
    protected void m25747T(C0530Z c0530z) {
        AbstractC1209m.m5303o(c0530z, "headers");
        C0554l0 c0554l0 = this.f22316s;
        if (c0554l0 != null) {
            this.f22316s = c0554l0.m2456e("headers: " + c0530z);
            return;
        }
        try {
            if (this.f22319v) {
                C0554l0 c0554l0M2462q = C0554l0.f2112s.m2462q("Received headers twice");
                this.f22316s = c0554l0M2462q;
                if (c0554l0M2462q != null) {
                    this.f22316s = c0554l0M2462q.m2456e("headers: " + c0530z);
                    this.f22317t = c0530z;
                    this.f22318u = m25742O(c0530z);
                    return;
                }
                return;
            }
            Integer num = (Integer) c0530z.m2283g(f22315x);
            if (num != null && num.intValue() >= 100 && num.intValue() < 200) {
                C0554l0 c0554l1 = this.f22316s;
                if (c0554l1 != null) {
                    this.f22316s = c0554l1.m2456e("headers: " + c0530z);
                    this.f22317t = c0530z;
                    this.f22318u = m25742O(c0530z);
                    return;
                }
                return;
            }
            this.f22319v = true;
            C0554l0 c0554l0M25745V = m25745V(c0530z);
            this.f22316s = c0554l0M25745V;
            if (c0554l0M25745V != null) {
                if (c0554l0M25745V != null) {
                    this.f22316s = c0554l0M25745V.m2456e("headers: " + c0530z);
                    this.f22317t = c0530z;
                    this.f22318u = m25742O(c0530z);
                    return;
                }
                return;
            }
            m25744R(c0530z);
            m25838E(c0530z);
            C0554l0 c0554l2 = this.f22316s;
            if (c0554l2 != null) {
                this.f22316s = c0554l2.m2456e("headers: " + c0530z);
                this.f22317t = c0530z;
                this.f22318u = m25742O(c0530z);
            }
        } catch (Throwable th) {
            C0554l0 c0554l3 = this.f22316s;
            if (c0554l3 != null) {
                this.f22316s = c0554l3.m2456e("headers: " + c0530z);
                this.f22317t = c0530z;
                this.f22318u = m25742O(c0530z);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: U */
    protected void m25748U(C0530Z c0530z) {
        AbstractC1209m.m5303o(c0530z, "trailers");
        if (this.f22316s == null && !this.f22319v) {
            C0554l0 c0554l0M25745V = m25745V(c0530z);
            this.f22316s = c0554l0M25745V;
            if (c0554l0M25745V != null) {
                this.f22317t = c0530z;
            }
        }
        C0554l0 c0554l0 = this.f22316s;
        if (c0554l0 == null) {
            C0554l0 c0554l0M25743Q = m25743Q(c0530z);
            m25744R(c0530z);
            m25839F(c0530z, c0554l0M25743Q);
        } else {
            C0554l0 c0554l0M2456e = c0554l0.m2456e("trailers: " + c0530z);
            this.f22316s = c0554l0M2456e;
            mo3279P(c0554l0M2456e, false, this.f22317t);
        }
    }

    @Override // io.grpc.internal.AbstractC5770a.c, io.grpc.internal.C5795m0.b
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ void mo3281c(boolean z7) {
        super.mo3281c(z7);
    }
}
