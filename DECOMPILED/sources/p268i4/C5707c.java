package p268i4;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1610H;

/* JADX INFO: renamed from: i4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5707c {

    /* JADX INFO: renamed from: a */
    private final String f21775a;

    /* JADX INFO: renamed from: b */
    private final long f21776b;

    /* JADX INFO: renamed from: c */
    private final Map f21777c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5707c(String sessionId, long j7) {
        this(sessionId, j7, null, 4, null);
        AbstractC6118n.m27187e(sessionId, "sessionId");
    }

    /* JADX INFO: renamed from: a */
    public final Map m25272a() {
        return this.f21777c;
    }

    /* JADX INFO: renamed from: b */
    public final String m25273b() {
        return this.f21775a;
    }

    /* JADX INFO: renamed from: c */
    public final long m25274c() {
        return this.f21776b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5707c)) {
            return false;
        }
        C5707c c5707c = (C5707c) obj;
        return AbstractC6118n.m27183a(this.f21775a, c5707c.f21775a) && this.f21776b == c5707c.f21776b && AbstractC6118n.m27183a(this.f21777c, c5707c.f21777c);
    }

    public int hashCode() {
        return (((this.f21775a.hashCode() * 31) + Long.hashCode(this.f21776b)) * 31) + this.f21777c.hashCode();
    }

    public String toString() {
        return "EventMetadata(sessionId=" + this.f21775a + ", timestamp=" + this.f21776b + ", additionalCustomKeys=" + this.f21777c + ')';
    }

    public C5707c(String sessionId, long j7, Map additionalCustomKeys) {
        AbstractC6118n.m27187e(sessionId, "sessionId");
        AbstractC6118n.m27187e(additionalCustomKeys, "additionalCustomKeys");
        this.f21775a = sessionId;
        this.f21776b = j7;
        this.f21777c = additionalCustomKeys;
    }

    public /* synthetic */ C5707c(String str, long j7, Map map, int i7, AbstractC6112h abstractC6112h) {
        this(str, j7, (i7 & 4) != 0 ? AbstractC1610H.m6626h() : map);
    }
}
