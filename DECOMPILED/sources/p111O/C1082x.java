package p111O;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.appcompat.app.AbstractC2263x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: O.x */
/* JADX INFO: loaded from: classes.dex */
public class C1082x {

    /* JADX INFO: renamed from: a */
    private final Runnable f3917a;

    /* JADX INFO: renamed from: b */
    private final CopyOnWriteArrayList f3918b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    private final Map f3919c = new HashMap();

    public C1082x(Runnable runnable) {
        this.f3917a = runnable;
    }

    /* JADX INFO: renamed from: a */
    public void m4785a(InterfaceC1086z interfaceC1086z) {
        this.f3918b.add(interfaceC1086z);
        this.f3917a.run();
    }

    /* JADX INFO: renamed from: b */
    public void m4786b(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f3918b.iterator();
        while (it.hasNext()) {
            ((InterfaceC1086z) it.next()).mo4808c(menu, menuInflater);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m4787c(Menu menu) {
        Iterator it = this.f3918b.iterator();
        while (it.hasNext()) {
            ((InterfaceC1086z) it.next()).mo4807b(menu);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m4788d(MenuItem menuItem) {
        Iterator it = this.f3918b.iterator();
        while (it.hasNext()) {
            if (((InterfaceC1086z) it.next()).mo4806a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m4789e(Menu menu) {
        Iterator it = this.f3918b.iterator();
        while (it.hasNext()) {
            ((InterfaceC1086z) it.next()).mo4809d(menu);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m4790f(InterfaceC1086z interfaceC1086z) {
        this.f3918b.remove(interfaceC1086z);
        AbstractC2263x.m9328a(this.f3919c.remove(interfaceC1086z));
        this.f3917a.run();
    }
}
