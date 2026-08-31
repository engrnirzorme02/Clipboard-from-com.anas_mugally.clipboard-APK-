package p063H5;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: H5.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0572x {

    /* JADX INFO: renamed from: d */
    public static final C0531a.c f2205d = C0531a.c.m2319a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* JADX INFO: renamed from: a */
    private final List f2206a;

    /* JADX INFO: renamed from: b */
    private final C0531a f2207b;

    /* JADX INFO: renamed from: c */
    private final int f2208c;

    public C0572x(List list, C0531a c0531a) {
        AbstractC1209m.m5293e(!list.isEmpty(), "addrs is empty");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f2206a = listUnmodifiableList;
        this.f2207b = (C0531a) AbstractC1209m.m5303o(c0531a, "attrs");
        this.f2208c = listUnmodifiableList.hashCode();
    }

    /* JADX INFO: renamed from: a */
    public List m2533a() {
        return this.f2206a;
    }

    /* JADX INFO: renamed from: b */
    public C0531a m2534b() {
        return this.f2207b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0572x)) {
            return false;
        }
        C0572x c0572x = (C0572x) obj;
        if (this.f2206a.size() != c0572x.f2206a.size()) {
            return false;
        }
        for (int i7 = 0; i7 < this.f2206a.size(); i7++) {
            if (!((SocketAddress) this.f2206a.get(i7)).equals(c0572x.f2206a.get(i7))) {
                return false;
            }
        }
        return this.f2207b.equals(c0572x.f2207b);
    }

    public int hashCode() {
        return this.f2208c;
    }

    public String toString() {
        return "[" + this.f2206a + "/" + this.f2207b + "]";
    }

    public C0572x(SocketAddress socketAddress) {
        this(socketAddress, C0531a.f1994c);
    }

    public C0572x(SocketAddress socketAddress, C0531a c0531a) {
        this(Collections.singletonList(socketAddress), c0531a);
    }
}
