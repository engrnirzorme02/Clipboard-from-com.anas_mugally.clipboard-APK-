package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.m */
/* JADX INFO: loaded from: classes.dex */
public class SubMenuC2288m extends C2280e implements SubMenu {

    /* JADX INFO: renamed from: B */
    private C2280e f7771B;

    /* JADX INFO: renamed from: C */
    private C2282g f7772C;

    public SubMenuC2288m(Context context, C2280e c2280e, C2282g c2282g) {
        super(context);
        this.f7771B = c2280e;
        this.f7772C = c2282g;
    }

    @Override // androidx.appcompat.view.menu.C2280e
    /* JADX INFO: renamed from: F */
    public C2280e mo9495F() {
        return this.f7771B.mo9495F();
    }

    @Override // androidx.appcompat.view.menu.C2280e
    /* JADX INFO: renamed from: I */
    public boolean mo9498I() {
        return this.f7771B.mo9498I();
    }

    @Override // androidx.appcompat.view.menu.C2280e
    /* JADX INFO: renamed from: J */
    public boolean mo9499J() {
        return this.f7771B.mo9499J();
    }

    @Override // androidx.appcompat.view.menu.C2280e
    /* JADX INFO: renamed from: K */
    public boolean mo9500K() {
        return this.f7771B.mo9500K();
    }

    @Override // androidx.appcompat.view.menu.C2280e
    /* JADX INFO: renamed from: W */
    public void mo9511W(C2280e.a aVar) {
        this.f7771B.mo9511W(aVar);
    }

    @Override // androidx.appcompat.view.menu.C2280e
    /* JADX INFO: renamed from: f */
    public boolean mo9524f(C2282g c2282g) {
        return this.f7771B.mo9524f(c2282g);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f7772C;
    }

    @Override // androidx.appcompat.view.menu.C2280e
    /* JADX INFO: renamed from: h */
    boolean mo9526h(C2280e c2280e, MenuItem menuItem) {
        return super.mo9526h(c2280e, menuItem) || this.f7771B.mo9526h(c2280e, menuItem);
    }

    /* JADX INFO: renamed from: j0 */
    public Menu m9590j0() {
        return this.f7771B;
    }

    @Override // androidx.appcompat.view.menu.C2280e
    /* JADX INFO: renamed from: m */
    public boolean mo9529m(C2282g c2282g) {
        return this.f7771B.mo9529m(c2282g);
    }

    @Override // androidx.appcompat.view.menu.C2280e, android.view.Menu
    public void setGroupDividerEnabled(boolean z7) {
        this.f7771B.setGroupDividerEnabled(z7);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m9516a0(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m9521d0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m9523e0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f7772C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C2280e, android.view.Menu
    public void setQwertyMode(boolean z7) {
        this.f7771B.setQwertyMode(z7);
    }

    @Override // androidx.appcompat.view.menu.C2280e
    /* JADX INFO: renamed from: v */
    public String mo9537v() {
        C2282g c2282g = this.f7772C;
        int itemId = c2282g != null ? c2282g.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo9537v() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i7) {
        return (SubMenu) super.m9514Z(i7);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i7) {
        return (SubMenu) super.m9519c0(i7);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i7) {
        this.f7772C.setIcon(i7);
        return this;
    }
}
