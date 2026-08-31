package p274j2;

import java.util.Map;
import p298m2.InterfaceC6328a;

/* JADX INFO: renamed from: j2.b */
/* JADX INFO: loaded from: classes.dex */
final class C5839b extends AbstractC5843f {

    /* JADX INFO: renamed from: a */
    private final InterfaceC6328a f22964a;

    /* JADX INFO: renamed from: b */
    private final Map f22965b;

    C5839b(InterfaceC6328a interfaceC6328a, Map map) {
        if (interfaceC6328a == null) {
            throw new NullPointerException("Null clock");
        }
        this.f22964a = interfaceC6328a;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f22965b = map;
    }

    @Override // p274j2.AbstractC5843f
    /* JADX INFO: renamed from: e */
    InterfaceC6328a mo26229e() {
        return this.f22964a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5843f) {
            AbstractC5843f abstractC5843f = (AbstractC5843f) obj;
            if (this.f22964a.equals(abstractC5843f.mo26229e()) && this.f22965b.equals(abstractC5843f.mo26230h())) {
                return true;
            }
        }
        return false;
    }

    @Override // p274j2.AbstractC5843f
    /* JADX INFO: renamed from: h */
    Map mo26230h() {
        return this.f22965b;
    }

    public int hashCode() {
        return ((this.f22964a.hashCode() ^ 1000003) * 1000003) ^ this.f22965b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f22964a + ", values=" + this.f22965b + "}";
    }
}
