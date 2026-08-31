package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.AbstractC2436b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p057H.InterfaceMenuC0491a;
import p111O.AbstractC1035b;
import p111O.AbstractC1039c0;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.e */
/* JADX INFO: loaded from: classes.dex */
public class C2280e implements InterfaceMenuC0491a {

    /* JADX INFO: renamed from: A */
    private static final int[] f7671A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    private final Context f7672a;

    /* JADX INFO: renamed from: b */
    private final Resources f7673b;

    /* JADX INFO: renamed from: c */
    private boolean f7674c;

    /* JADX INFO: renamed from: d */
    private boolean f7675d;

    /* JADX INFO: renamed from: e */
    private a f7676e;

    /* JADX INFO: renamed from: m */
    private ContextMenu.ContextMenuInfo f7684m;

    /* JADX INFO: renamed from: n */
    CharSequence f7685n;

    /* JADX INFO: renamed from: o */
    Drawable f7686o;

    /* JADX INFO: renamed from: p */
    View f7687p;

    /* JADX INFO: renamed from: x */
    private C2282g f7695x;

    /* JADX INFO: renamed from: z */
    private boolean f7697z;

    /* JADX INFO: renamed from: l */
    private int f7683l = 0;

    /* JADX INFO: renamed from: q */
    private boolean f7688q = false;

    /* JADX INFO: renamed from: r */
    private boolean f7689r = false;

    /* JADX INFO: renamed from: s */
    private boolean f7690s = false;

    /* JADX INFO: renamed from: t */
    private boolean f7691t = false;

    /* JADX INFO: renamed from: u */
    private boolean f7692u = false;

    /* JADX INFO: renamed from: v */
    private ArrayList f7693v = new ArrayList();

    /* JADX INFO: renamed from: w */
    private CopyOnWriteArrayList f7694w = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y */
    private boolean f7696y = false;

    /* JADX INFO: renamed from: f */
    private ArrayList f7677f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private ArrayList f7678g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private boolean f7679h = true;

    /* JADX INFO: renamed from: i */
    private ArrayList f7680i = new ArrayList();

    /* JADX INFO: renamed from: j */
    private ArrayList f7681j = new ArrayList();

    /* JADX INFO: renamed from: k */
    private boolean f7682k = true;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo9231a(C2280e c2280e, MenuItem menuItem);

        /* JADX INFO: renamed from: b */
        void mo9233b(C2280e c2280e);
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.e$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo9422a(C2282g c2282g);
    }

    public C2280e(Context context) {
        this.f7672a = context;
        this.f7673b = context.getResources();
        m9485g0(true);
    }

    /* JADX INFO: renamed from: D */
    private static int m9481D(int i7) {
        int i8 = ((-65536) & i7) >> 16;
        if (i8 >= 0) {
            int[] iArr = f7671A;
            if (i8 < iArr.length) {
                return (i7 & 65535) | (iArr[i8] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* JADX INFO: renamed from: Q */
    private void m9482Q(int i7, boolean z7) {
        if (i7 < 0 || i7 >= this.f7677f.size()) {
            return;
        }
        this.f7677f.remove(i7);
        if (z7) {
            mo9503N(true);
        }
    }

    /* JADX INFO: renamed from: b0 */
    private void m9483b0(int i7, CharSequence charSequence, int i8, Drawable drawable, View view) {
        Resources resourcesM9494E = m9494E();
        if (view != null) {
            this.f7687p = view;
            this.f7685n = null;
            this.f7686o = null;
        } else {
            if (i7 > 0) {
                this.f7685n = resourcesM9494E.getText(i7);
            } else if (charSequence != null) {
                this.f7685n = charSequence;
            }
            if (i8 > 0) {
                this.f7686o = AbstractC2436b.getDrawable(m9538w(), i8);
            } else if (drawable != null) {
                this.f7686o = drawable;
            }
            this.f7687p = null;
        }
        mo9503N(false);
    }

    /* JADX INFO: renamed from: g */
    private C2282g m9484g(int i7, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        return new C2282g(this, i7, i8, i9, i10, charSequence, i11);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: g0 */
    private void m9485g0(boolean z7) {
        boolean z8;
        if (z7) {
            z8 = this.f7673b.getConfiguration().keyboard != 1 && AbstractC1039c0.m4630j(ViewConfiguration.get(this.f7672a), this.f7672a);
        }
        this.f7675d = z8;
    }

    /* JADX INFO: renamed from: i */
    private void m9486i(boolean z7) {
        if (this.f7694w.isEmpty()) {
            return;
        }
        m9528i0();
        for (WeakReference weakReference : this.f7694w) {
            InterfaceC2285j interfaceC2285j = (InterfaceC2285j) weakReference.get();
            if (interfaceC2285j == null) {
                this.f7694w.remove(weakReference);
            } else {
                interfaceC2285j.mo9433d(z7);
            }
        }
        m9527h0();
    }

    /* JADX INFO: renamed from: j */
    private void m9487j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f7694w.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : this.f7694w) {
            InterfaceC2285j interfaceC2285j = (InterfaceC2285j) weakReference.get();
            if (interfaceC2285j == null) {
                this.f7694w.remove(weakReference);
            } else {
                int id = interfaceC2285j.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    interfaceC2285j.mo9456j(parcelable);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private void m9488k(Bundle bundle) {
        Parcelable parcelableMo9458m;
        if (this.f7694w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : this.f7694w) {
            InterfaceC2285j interfaceC2285j = (InterfaceC2285j) weakReference.get();
            if (interfaceC2285j == null) {
                this.f7694w.remove(weakReference);
            } else {
                int id = interfaceC2285j.getId();
                if (id > 0 && (parcelableMo9458m = interfaceC2285j.mo9458m()) != null) {
                    sparseArray.put(id, parcelableMo9458m);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    /* JADX INFO: renamed from: l */
    private boolean m9489l(SubMenuC2288m subMenuC2288m, InterfaceC2285j interfaceC2285j) {
        if (this.f7694w.isEmpty()) {
            return false;
        }
        boolean zMo9439l = interfaceC2285j != null ? interfaceC2285j.mo9439l(subMenuC2288m) : false;
        for (WeakReference weakReference : this.f7694w) {
            InterfaceC2285j interfaceC2285j2 = (InterfaceC2285j) weakReference.get();
            if (interfaceC2285j2 == null) {
                this.f7694w.remove(weakReference);
            } else if (!zMo9439l) {
                zMo9439l = interfaceC2285j2.mo9439l(subMenuC2288m);
            }
        }
        return zMo9439l;
    }

    /* JADX INFO: renamed from: p */
    private static int m9490p(ArrayList arrayList, int i7) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C2282g) arrayList.get(size)).m9549f() <= i7) {
                return size + 1;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: A */
    public View m9491A() {
        return this.f7687p;
    }

    /* JADX INFO: renamed from: B */
    public ArrayList m9492B() {
        m9535t();
        return this.f7681j;
    }

    /* JADX INFO: renamed from: C */
    boolean m9493C() {
        return this.f7691t;
    }

    /* JADX INFO: renamed from: E */
    Resources m9494E() {
        return this.f7673b;
    }

    /* JADX INFO: renamed from: F */
    public C2280e mo9495F() {
        return this;
    }

    /* JADX INFO: renamed from: G */
    public ArrayList m9496G() {
        if (!this.f7679h) {
            return this.f7678g;
        }
        this.f7678g.clear();
        int size = this.f7677f.size();
        for (int i7 = 0; i7 < size; i7++) {
            C2282g c2282g = (C2282g) this.f7677f.get(i7);
            if (c2282g.isVisible()) {
                this.f7678g.add(c2282g);
            }
        }
        this.f7679h = false;
        this.f7682k = true;
        return this.f7678g;
    }

    /* JADX INFO: renamed from: H */
    public boolean m9497H() {
        return !this.f7688q;
    }

    /* JADX INFO: renamed from: I */
    public boolean mo9498I() {
        return this.f7696y;
    }

    /* JADX INFO: renamed from: J */
    boolean mo9499J() {
        return this.f7674c;
    }

    /* JADX INFO: renamed from: K */
    public boolean mo9500K() {
        return this.f7675d;
    }

    /* JADX INFO: renamed from: L */
    void m9501L(C2282g c2282g) {
        this.f7682k = true;
        mo9503N(true);
    }

    /* JADX INFO: renamed from: M */
    void m9502M(C2282g c2282g) {
        this.f7679h = true;
        mo9503N(true);
    }

    /* JADX INFO: renamed from: N */
    public void mo9503N(boolean z7) {
        if (this.f7688q) {
            this.f7689r = true;
            if (z7) {
                this.f7690s = true;
                return;
            }
            return;
        }
        if (z7) {
            this.f7679h = true;
            this.f7682k = true;
        }
        m9486i(z7);
    }

    /* JADX INFO: renamed from: O */
    public boolean m9504O(MenuItem menuItem, int i7) {
        return m9505P(menuItem, null, i7);
    }

    /* JADX INFO: renamed from: P */
    public boolean m9505P(MenuItem menuItem, InterfaceC2285j interfaceC2285j, int i7) {
        C2282g c2282g = (C2282g) menuItem;
        if (c2282g == null || !c2282g.isEnabled()) {
            return false;
        }
        boolean zM9554k = c2282g.m9554k();
        AbstractC1035b abstractC1035bMo2092b = c2282g.mo2092b();
        boolean z7 = abstractC1035bMo2092b != null && abstractC1035bMo2092b.mo4610a();
        if (c2282g.m9553j()) {
            boolean zExpandActionView = c2282g.expandActionView() | zM9554k;
            if (zExpandActionView) {
                m9522e(true);
            }
            return zExpandActionView;
        }
        if (!c2282g.hasSubMenu() && !z7) {
            if ((i7 & 1) == 0) {
                m9522e(true);
            }
            return zM9554k;
        }
        if ((i7 & 4) == 0) {
            m9522e(false);
        }
        if (!c2282g.hasSubMenu()) {
            c2282g.m9567x(new SubMenuC2288m(m9538w(), this, c2282g));
        }
        SubMenuC2288m subMenuC2288m = (SubMenuC2288m) c2282g.getSubMenu();
        if (z7) {
            abstractC1035bMo2092b.mo4614e(subMenuC2288m);
        }
        boolean zM9489l = m9489l(subMenuC2288m, interfaceC2285j) | zM9554k;
        if (!zM9489l) {
            m9522e(true);
        }
        return zM9489l;
    }

    /* JADX INFO: renamed from: R */
    public void m9506R(InterfaceC2285j interfaceC2285j) {
        for (WeakReference weakReference : this.f7694w) {
            InterfaceC2285j interfaceC2285j2 = (InterfaceC2285j) weakReference.get();
            if (interfaceC2285j2 == null || interfaceC2285j2 == interfaceC2285j) {
                this.f7694w.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m9507S(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo9537v());
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC2288m) item.getSubMenu()).m9507S(bundle);
            }
        }
        int i8 = bundle.getInt("android:menu:expandedactionview");
        if (i8 <= 0 || (menuItemFindItem = findItem(i8)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* JADX INFO: renamed from: T */
    public void m9508T(Bundle bundle) {
        m9487j(bundle);
    }

    /* JADX INFO: renamed from: U */
    public void m9509U(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC2288m) item.getSubMenu()).m9509U(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo9537v(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m9510V(Bundle bundle) {
        m9488k(bundle);
    }

    /* JADX INFO: renamed from: W */
    public void mo9511W(a aVar) {
        this.f7676e = aVar;
    }

    /* JADX INFO: renamed from: X */
    public C2280e m9512X(int i7) {
        this.f7683l = i7;
        return this;
    }

    /* JADX INFO: renamed from: Y */
    void m9513Y(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f7677f.size();
        m9528i0();
        for (int i7 = 0; i7 < size; i7++) {
            C2282g c2282g = (C2282g) this.f7677f.get(i7);
            if (c2282g.getGroupId() == groupId && c2282g.m9556m() && c2282g.isCheckable()) {
                c2282g.m9562s(c2282g == menuItem);
            }
        }
        m9527h0();
    }

    /* JADX INFO: renamed from: Z */
    protected C2280e m9514Z(int i7) {
        m9483b0(0, null, i7, null, null);
        return this;
    }

    /* JADX INFO: renamed from: a */
    protected MenuItem m9515a(int i7, int i8, int i9, CharSequence charSequence) {
        int iM9481D = m9481D(i9);
        C2282g c2282gM9484g = m9484g(i7, i8, i9, iM9481D, charSequence, this.f7683l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f7684m;
        if (contextMenuInfo != null) {
            c2282gM9484g.m9565v(contextMenuInfo);
        }
        ArrayList arrayList = this.f7677f;
        arrayList.add(m9490p(arrayList, iM9481D), c2282gM9484g);
        mo9503N(true);
        return c2282gM9484g;
    }

    /* JADX INFO: renamed from: a0 */
    protected C2280e m9516a0(Drawable drawable) {
        m9483b0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m9515a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        int i11;
        PackageManager packageManager = this.f7672a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i10 & 1) == 0) {
            removeGroup(i7);
        }
        for (int i12 = 0; i12 < size; i12++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i12);
            int i13 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i13 < 0 ? intent : intentArr[i13]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i7, i8, i9, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i11 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i11] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public void m9517b(InterfaceC2285j interfaceC2285j) {
        m9518c(interfaceC2285j, this.f7672a);
    }

    /* JADX INFO: renamed from: c */
    public void m9518c(InterfaceC2285j interfaceC2285j, Context context) {
        this.f7694w.add(new WeakReference(interfaceC2285j));
        interfaceC2285j.mo9437i(context, this);
        this.f7682k = true;
    }

    /* JADX INFO: renamed from: c0 */
    protected C2280e m9519c0(int i7) {
        m9483b0(i7, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        C2282g c2282g = this.f7695x;
        if (c2282g != null) {
            mo9524f(c2282g);
        }
        this.f7677f.clear();
        mo9503N(true);
    }

    public void clearHeader() {
        this.f7686o = null;
        this.f7685n = null;
        this.f7687p = null;
        mo9503N(false);
    }

    @Override // android.view.Menu
    public void close() {
        m9522e(true);
    }

    /* JADX INFO: renamed from: d */
    public void m9520d() {
        a aVar = this.f7676e;
        if (aVar != null) {
            aVar.mo9233b(this);
        }
    }

    /* JADX INFO: renamed from: d0 */
    protected C2280e m9521d0(CharSequence charSequence) {
        m9483b0(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m9522e(boolean z7) {
        if (this.f7692u) {
            return;
        }
        this.f7692u = true;
        for (WeakReference weakReference : this.f7694w) {
            InterfaceC2285j interfaceC2285j = (InterfaceC2285j) weakReference.get();
            if (interfaceC2285j == null) {
                this.f7694w.remove(weakReference);
            } else {
                interfaceC2285j.mo9432c(this, z7);
            }
        }
        this.f7692u = false;
    }

    /* JADX INFO: renamed from: e0 */
    protected C2280e m9523e0(View view) {
        m9483b0(0, null, 0, null, view);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo9524f(C2282g c2282g) {
        boolean zMo9434f = false;
        if (!this.f7694w.isEmpty() && this.f7695x == c2282g) {
            m9528i0();
            for (WeakReference weakReference : this.f7694w) {
                InterfaceC2285j interfaceC2285j = (InterfaceC2285j) weakReference.get();
                if (interfaceC2285j != null) {
                    zMo9434f = interfaceC2285j.mo9434f(this, c2282g);
                    if (zMo9434f) {
                        break;
                    }
                } else {
                    this.f7694w.remove(weakReference);
                }
            }
            m9527h0();
            if (zMo9434f) {
                this.f7695x = null;
            }
        }
        return zMo9434f;
    }

    /* JADX INFO: renamed from: f0 */
    public void m9525f0(boolean z7) {
        this.f7697z = z7;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i7) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            C2282g c2282g = (C2282g) this.f7677f.get(i8);
            if (c2282g.getItemId() == i7) {
                return c2282g;
            }
            if (c2282g.hasSubMenu() && (menuItemFindItem = c2282g.getSubMenu().findItem(i7)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i7) {
        return (MenuItem) this.f7677f.get(i7);
    }

    /* JADX INFO: renamed from: h */
    boolean mo9526h(C2280e c2280e, MenuItem menuItem) {
        a aVar = this.f7676e;
        return aVar != null && aVar.mo9231a(c2280e, menuItem);
    }

    /* JADX INFO: renamed from: h0 */
    public void m9527h0() {
        this.f7688q = false;
        if (this.f7689r) {
            this.f7689r = false;
            mo9503N(this.f7690s);
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f7697z) {
            return true;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((C2282g) this.f7677f.get(i7)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i0 */
    public void m9528i0() {
        if (this.f7688q) {
            return;
        }
        this.f7688q = true;
        this.f7689r = false;
        this.f7690s = false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return m9533r(i7, keyEvent) != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo9529m(C2282g c2282g) {
        boolean zMo9435g = false;
        if (this.f7694w.isEmpty()) {
            return false;
        }
        m9528i0();
        for (WeakReference weakReference : this.f7694w) {
            InterfaceC2285j interfaceC2285j = (InterfaceC2285j) weakReference.get();
            if (interfaceC2285j != null) {
                zMo9435g = interfaceC2285j.mo9435g(this, c2282g);
                if (zMo9435g) {
                    break;
                }
            } else {
                this.f7694w.remove(weakReference);
            }
        }
        m9527h0();
        if (zMo9435g) {
            this.f7695x = c2282g;
        }
        return zMo9435g;
    }

    /* JADX INFO: renamed from: n */
    public int m9530n(int i7) {
        return m9531o(i7, 0);
    }

    /* JADX INFO: renamed from: o */
    public int m9531o(int i7, int i8) {
        int size = size();
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < size) {
            if (((C2282g) this.f7677f.get(i8)).getGroupId() == i7) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i7, int i8) {
        return m9504O(findItem(i7), i8);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        C2282g c2282gM9533r = m9533r(i7, keyEvent);
        boolean zM9504O = c2282gM9533r != null ? m9504O(c2282gM9533r, i8) : false;
        if ((i8 & 2) != 0) {
            m9522e(true);
        }
        return zM9504O;
    }

    /* JADX INFO: renamed from: q */
    public int m9532q(int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((C2282g) this.f7677f.get(i8)).getItemId() == i7) {
                return i8;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    C2282g m9533r(int i7, KeyEvent keyEvent) {
        ArrayList arrayList = this.f7693v;
        arrayList.clear();
        m9534s(arrayList, i7, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C2282g) arrayList.get(0);
        }
        boolean zMo9499J = mo9499J();
        for (int i8 = 0; i8 < size; i8++) {
            C2282g c2282g = (C2282g) arrayList.get(i8);
            char alphabeticShortcut = zMo9499J ? c2282g.getAlphabeticShortcut() : c2282g.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zMo9499J && alphabeticShortcut == '\b' && i7 == 67))) {
                return c2282g;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i7) {
        int iM9530n = m9530n(i7);
        if (iM9530n >= 0) {
            int size = this.f7677f.size() - iM9530n;
            int i8 = 0;
            while (true) {
                int i9 = i8 + 1;
                if (i8 >= size || ((C2282g) this.f7677f.get(iM9530n)).getGroupId() != i7) {
                    break;
                }
                m9482Q(iM9530n, false);
                i8 = i9;
            }
            mo9503N(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i7) {
        m9482Q(m9532q(i7), true);
    }

    /* JADX INFO: renamed from: s */
    void m9534s(List list, int i7, KeyEvent keyEvent) {
        boolean zMo9499J = mo9499J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i7 == 67) {
            int size = this.f7677f.size();
            for (int i8 = 0; i8 < size; i8++) {
                C2282g c2282g = (C2282g) this.f7677f.get(i8);
                if (c2282g.hasSubMenu()) {
                    ((C2280e) c2282g.getSubMenu()).m9534s(list, i7, keyEvent);
                }
                char alphabeticShortcut = zMo9499J ? c2282g.getAlphabeticShortcut() : c2282g.getNumericShortcut();
                if ((modifiers & 69647) == ((zMo9499J ? c2282g.getAlphabeticModifiers() : c2282g.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zMo9499J && alphabeticShortcut == '\b' && i7 == 67)) && c2282g.isEnabled()) {
                        list.add(c2282g);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i7, boolean z7, boolean z8) {
        int size = this.f7677f.size();
        for (int i8 = 0; i8 < size; i8++) {
            C2282g c2282g = (C2282g) this.f7677f.get(i8);
            if (c2282g.getGroupId() == i7) {
                c2282g.m9563t(z8);
                c2282g.setCheckable(z7);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z7) {
        this.f7696y = z7;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i7, boolean z7) {
        int size = this.f7677f.size();
        for (int i8 = 0; i8 < size; i8++) {
            C2282g c2282g = (C2282g) this.f7677f.get(i8);
            if (c2282g.getGroupId() == i7) {
                c2282g.setEnabled(z7);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i7, boolean z7) {
        int size = this.f7677f.size();
        boolean z8 = false;
        for (int i8 = 0; i8 < size; i8++) {
            C2282g c2282g = (C2282g) this.f7677f.get(i8);
            if (c2282g.getGroupId() == i7 && c2282g.m9568y(z7)) {
                z8 = true;
            }
        }
        if (z8) {
            mo9503N(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z7) {
        this.f7674c = z7;
        mo9503N(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f7677f.size();
    }

    /* JADX INFO: renamed from: t */
    public void m9535t() {
        ArrayList arrayListM9496G = m9496G();
        if (this.f7682k) {
            boolean zMo9455e = false;
            for (WeakReference weakReference : this.f7694w) {
                InterfaceC2285j interfaceC2285j = (InterfaceC2285j) weakReference.get();
                if (interfaceC2285j == null) {
                    this.f7694w.remove(weakReference);
                } else {
                    zMo9455e |= interfaceC2285j.mo9455e();
                }
            }
            if (zMo9455e) {
                this.f7680i.clear();
                this.f7681j.clear();
                int size = arrayListM9496G.size();
                for (int i7 = 0; i7 < size; i7++) {
                    C2282g c2282g = (C2282g) arrayListM9496G.get(i7);
                    if (c2282g.m9555l()) {
                        this.f7680i.add(c2282g);
                    } else {
                        this.f7681j.add(c2282g);
                    }
                }
            } else {
                this.f7680i.clear();
                this.f7681j.clear();
                this.f7681j.addAll(m9496G());
            }
            this.f7682k = false;
        }
    }

    /* JADX INFO: renamed from: u */
    public ArrayList m9536u() {
        m9535t();
        return this.f7680i;
    }

    /* JADX INFO: renamed from: v */
    protected String mo9537v() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: w */
    public Context m9538w() {
        return this.f7672a;
    }

    /* JADX INFO: renamed from: x */
    public C2282g m9539x() {
        return this.f7695x;
    }

    /* JADX INFO: renamed from: y */
    public Drawable m9540y() {
        return this.f7686o;
    }

    /* JADX INFO: renamed from: z */
    public CharSequence m9541z() {
        return this.f7685n;
    }

    @Override // android.view.Menu
    public MenuItem add(int i7) {
        return m9515a(0, 0, 0, this.f7673b.getString(i7));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.f7673b.getString(i7));
    }

    @Override // android.view.Menu
    public MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return m9515a(i7, i8, i9, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        C2282g c2282g = (C2282g) m9515a(i7, i8, i9, charSequence);
        SubMenuC2288m subMenuC2288m = new SubMenuC2288m(this.f7672a, this, c2282g);
        c2282g.m9567x(subMenuC2288m);
        return subMenuC2288m;
    }

    @Override // android.view.Menu
    public MenuItem add(int i7, int i8, int i9, int i10) {
        return m9515a(i7, i8, i9, this.f7673b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return addSubMenu(i7, i8, i9, this.f7673b.getString(i10));
    }
}
