package p295m;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.C2400k;
import p057H.InterfaceMenuItemC0492b;

/* JADX INFO: renamed from: m.b */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC6315b {

    /* JADX INFO: renamed from: a */
    final Context f24138a;

    /* JADX INFO: renamed from: b */
    private C2400k f24139b;

    /* JADX INFO: renamed from: c */
    private C2400k f24140c;

    AbstractC6315b(Context context) {
        this.f24138a = context;
    }

    /* JADX INFO: renamed from: c */
    final MenuItem m27254c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0492b)) {
            return menuItem;
        }
        InterfaceMenuItemC0492b interfaceMenuItemC0492b = (InterfaceMenuItemC0492b) menuItem;
        if (this.f24139b == null) {
            this.f24139b = new C2400k();
        }
        MenuItem menuItem2 = (MenuItem) this.f24139b.get(interfaceMenuItemC0492b);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC6316c menuItemC6316c = new MenuItemC6316c(this.f24138a, interfaceMenuItemC0492b);
        this.f24139b.put(interfaceMenuItemC0492b, menuItemC6316c);
        return menuItemC6316c;
    }

    /* JADX INFO: renamed from: d */
    final SubMenu m27255d(SubMenu subMenu) {
        return subMenu;
    }

    /* JADX INFO: renamed from: e */
    final void m27256e() {
        C2400k c2400k = this.f24139b;
        if (c2400k != null) {
            c2400k.clear();
        }
        C2400k c2400k2 = this.f24140c;
        if (c2400k2 != null) {
            c2400k2.clear();
        }
    }

    /* JADX INFO: renamed from: f */
    final void m27257f(int i7) {
        if (this.f24139b == null) {
            return;
        }
        int i8 = 0;
        while (i8 < this.f24139b.size()) {
            if (((InterfaceMenuItemC0492b) this.f24139b.m10300f(i8)).getGroupId() == i7) {
                this.f24139b.mo8381h(i8);
                i8--;
            }
            i8++;
        }
    }

    /* JADX INFO: renamed from: g */
    final void m27258g(int i7) {
        if (this.f24139b == null) {
            return;
        }
        for (int i8 = 0; i8 < this.f24139b.size(); i8++) {
            if (((InterfaceMenuItemC0492b) this.f24139b.m10300f(i8)).getItemId() == i7) {
                this.f24139b.mo8381h(i8);
                return;
            }
        }
    }
}
