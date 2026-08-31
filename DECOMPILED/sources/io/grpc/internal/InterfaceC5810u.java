package io.grpc.internal;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;
import p063H5.AbstractC0541f;
import p063H5.C0509D;
import p063H5.C0531a;
import p122P3.AbstractC1205i;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.u */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5810u extends Closeable {

    /* JADX INFO: renamed from: io.grpc.internal.u$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private String f22903a = "unknown-authority";

        /* JADX INFO: renamed from: b */
        private C0531a f22904b = C0531a.f1994c;

        /* JADX INFO: renamed from: c */
        private String f22905c;

        /* JADX INFO: renamed from: d */
        private C0509D f22906d;

        /* JADX INFO: renamed from: a */
        public String m26182a() {
            return this.f22903a;
        }

        /* JADX INFO: renamed from: b */
        public C0531a m26183b() {
            return this.f22904b;
        }

        /* JADX INFO: renamed from: c */
        public C0509D m26184c() {
            return this.f22906d;
        }

        /* JADX INFO: renamed from: d */
        public String m26185d() {
            return this.f22905c;
        }

        /* JADX INFO: renamed from: e */
        public a m26186e(String str) {
            this.f22903a = (String) AbstractC1209m.m5303o(str, "authority");
            return this;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f22903a.equals(aVar.f22903a) && this.f22904b.equals(aVar.f22904b) && AbstractC1205i.m5282a(this.f22905c, aVar.f22905c) && AbstractC1205i.m5282a(this.f22906d, aVar.f22906d);
        }

        /* JADX INFO: renamed from: f */
        public a m26187f(C0531a c0531a) {
            AbstractC1209m.m5303o(c0531a, "eagAttributes");
            this.f22904b = c0531a;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m26188g(C0509D c0509d) {
            this.f22906d = c0509d;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public a m26189h(String str) {
            this.f22905c = str;
            return this;
        }

        public int hashCode() {
            return AbstractC1205i.m5283b(this.f22903a, this.f22904b, this.f22905c, this.f22906d);
        }
    }

    /* JADX INFO: renamed from: M */
    InterfaceC5814w mo3244M(SocketAddress socketAddress, a aVar, AbstractC0541f abstractC0541f);

    /* JADX INFO: renamed from: M0 */
    Collection mo3245M0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    /* JADX INFO: renamed from: z0 */
    ScheduledExecutorService mo3246z0();
}
