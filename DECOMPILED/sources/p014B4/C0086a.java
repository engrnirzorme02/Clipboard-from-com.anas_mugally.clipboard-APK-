package p014B4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p006A4.C0018c;
import p006A4.InterfaceC0020e;
import p030D4.C0198b;
import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: B4.a */
/* JADX INFO: loaded from: classes.dex */
public class C0086a {

    /* JADX INFO: renamed from: a */
    private final Map f470a = new HashMap();

    /* JADX INFO: renamed from: a */
    public List m298a() {
        return new ArrayList(this.f470a.values());
    }

    /* JADX INFO: renamed from: b */
    public void m299b(C0018c c0018c) {
        InterfaceC0020e.a aVarM102j = c0018c.m102j();
        C0198b c0198bM101i = c0018c.m101i();
        InterfaceC0020e.a aVar = InterfaceC0020e.a.CHILD_ADDED;
        AbstractC7551l.m33234g(aVarM102j == aVar || aVarM102j == InterfaceC0020e.a.CHILD_CHANGED || aVarM102j == InterfaceC0020e.a.CHILD_REMOVED, "Only child changes supported for tracking");
        AbstractC7551l.m33233f(true ^ c0018c.m101i().m996q());
        if (!this.f470a.containsKey(c0198bM101i)) {
            this.f470a.put(c0018c.m101i(), c0018c);
            return;
        }
        C0018c c0018c2 = (C0018c) this.f470a.get(c0198bM101i);
        InterfaceC0020e.a aVarM102j2 = c0018c2.m102j();
        if (aVarM102j == aVar && aVarM102j2 == InterfaceC0020e.a.CHILD_REMOVED) {
            this.f470a.put(c0018c.m101i(), C0018c.m94d(c0198bM101i, c0018c.m103k(), c0018c2.m103k()));
            return;
        }
        InterfaceC0020e.a aVar2 = InterfaceC0020e.a.CHILD_REMOVED;
        if (aVarM102j == aVar2 && aVarM102j2 == aVar) {
            this.f470a.remove(c0198bM101i);
            return;
        }
        if (aVarM102j == aVar2 && aVarM102j2 == InterfaceC0020e.a.CHILD_CHANGED) {
            this.f470a.put(c0198bM101i, C0018c.m97g(c0198bM101i, c0018c2.m104l()));
            return;
        }
        InterfaceC0020e.a aVar3 = InterfaceC0020e.a.CHILD_CHANGED;
        if (aVarM102j == aVar3 && aVarM102j2 == aVar) {
            this.f470a.put(c0198bM101i, C0018c.m92b(c0198bM101i, c0018c.m103k()));
            return;
        }
        if (aVarM102j == aVar3 && aVarM102j2 == aVar3) {
            this.f470a.put(c0198bM101i, C0018c.m94d(c0198bM101i, c0018c.m103k(), c0018c2.m104l()));
            return;
        }
        throw new IllegalStateException("Illegal combination of changes: " + c0018c + " occurred after " + c0018c2);
    }
}
