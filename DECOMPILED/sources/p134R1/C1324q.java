package p134R1;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p155U1.InterfaceC1660c;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: R1.q */
/* JADX INFO: loaded from: classes.dex */
public class C1324q {

    /* JADX INFO: renamed from: a */
    private final Set f4620a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    private final Set f4621b = new HashSet();

    /* JADX INFO: renamed from: c */
    private boolean f4622c;

    /* JADX INFO: renamed from: a */
    public boolean m5670a(InterfaceC1660c interfaceC1660c) {
        boolean z7 = true;
        if (interfaceC1660c == null) {
            return true;
        }
        boolean zRemove = this.f4620a.remove(interfaceC1660c);
        if (!this.f4621b.remove(interfaceC1660c) && !zRemove) {
            z7 = false;
        }
        if (z7) {
            interfaceC1660c.clear();
        }
        return z7;
    }

    /* JADX INFO: renamed from: b */
    public void m5671b() {
        Iterator it = AbstractC2023l.m8419j(this.f4620a).iterator();
        while (it.hasNext()) {
            m5670a((InterfaceC1660c) it.next());
        }
        this.f4621b.clear();
    }

    /* JADX INFO: renamed from: c */
    public void m5672c() {
        this.f4622c = true;
        for (InterfaceC1660c interfaceC1660c : AbstractC2023l.m8419j(this.f4620a)) {
            if (interfaceC1660c.isRunning() || interfaceC1660c.mo6994k()) {
                interfaceC1660c.clear();
                this.f4621b.add(interfaceC1660c);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m5673d() {
        this.f4622c = true;
        for (InterfaceC1660c interfaceC1660c : AbstractC2023l.m8419j(this.f4620a)) {
            if (interfaceC1660c.isRunning()) {
                interfaceC1660c.pause();
                this.f4621b.add(interfaceC1660c);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m5674e() {
        for (InterfaceC1660c interfaceC1660c : AbstractC2023l.m8419j(this.f4620a)) {
            if (!interfaceC1660c.mo6994k() && !interfaceC1660c.mo6990g()) {
                interfaceC1660c.clear();
                if (this.f4622c) {
                    this.f4621b.add(interfaceC1660c);
                } else {
                    interfaceC1660c.mo6991h();
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m5675f() {
        this.f4622c = false;
        for (InterfaceC1660c interfaceC1660c : AbstractC2023l.m8419j(this.f4620a)) {
            if (!interfaceC1660c.mo6994k() && !interfaceC1660c.isRunning()) {
                interfaceC1660c.mo6991h();
            }
        }
        this.f4621b.clear();
    }

    /* JADX INFO: renamed from: g */
    public void m5676g(InterfaceC1660c interfaceC1660c) {
        this.f4620a.add(interfaceC1660c);
        if (!this.f4622c) {
            interfaceC1660c.mo6991h();
            return;
        }
        interfaceC1660c.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f4621b.add(interfaceC1660c);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f4620a.size() + ", isPaused=" + this.f4622c + "}";
    }
}
