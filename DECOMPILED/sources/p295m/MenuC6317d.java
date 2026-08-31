package p295m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p057H.InterfaceMenuC0491a;

/* JADX INFO: renamed from: m.d */
/* JADX INFO: loaded from: classes.dex */
public class MenuC6317d extends AbstractC6315b implements Menu {

    /* JADX INFO: renamed from: d */
    private final InterfaceMenuC0491a f24151d;

    public MenuC6317d(Context context, InterfaceMenuC0491a interfaceMenuC0491a) {
        super(context);
        if (interfaceMenuC0491a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f24151d = interfaceMenuC0491a;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m27254c(this.f24151d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f24151d.addIntentOptions(i7, i8, i9, componentName, intentArr, intent, i10, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                menuItemArr[i11] = m27254c(menuItemArr2[i11]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m27255d(this.f24151d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m27256e();
        this.f24151d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f24151d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i7) {
        return m27254c(this.f24151d.findItem(i7));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i7) {
        return m27254c(this.f24151d.getItem(i7));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f24151d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return this.f24151d.isShortcutKey(i7, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i7, int i8) {
        return this.f24151d.performIdentifierAction(i7, i8);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        return this.f24151d.performShortcut(i7, keyEvent, i8);
    }

    @Override // android.view.Menu
    public void removeGroup(int i7) {
        m27257f(i7);
        this.f24151d.removeGroup(i7);
    }

    @Override // android.view.Menu
    public void removeItem(int i7) {
        m27258g(i7);
        this.f24151d.removeItem(i7);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i7, boolean z7, boolean z8) {
        this.f24151d.setGroupCheckable(i7, z7, z8);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i7, boolean z7) {
        this.f24151d.setGroupEnabled(i7, z7);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i7, boolean z7) {
        this.f24151d.setGroupVisible(i7, z7);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z7) {
        this.f24151d.setQwertyMode(z7);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f24151d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i7) {
        return m27254c(this.f24151d.add(i7));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7) {
        return m27255d(this.f24151d.addSubMenu(i7));
    }

    @Override // android.view.Menu
    public MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return m27254c(this.f24151d.add(i7, i8, i9, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        return m27255d(this.f24151d.addSubMenu(i7, i8, i9, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i7, int i8, int i9, int i10) {
        return m27254c(this.f24151d.add(i7, i8, i9, i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return m27255d(this.f24151d.addSubMenu(i7, i8, i9, i10));
    }
}
