package p105N0;

import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import p088K6.AbstractC0764a;
import p098M0.InterfaceC0872b;

/* JADX INFO: renamed from: N0.j */
/* JADX INFO: loaded from: classes.dex */
public class C0922j implements ProfileStore {

    /* JADX INFO: renamed from: b */
    private static ProfileStore f3559b;

    /* JADX INFO: renamed from: a */
    private final ProfileStoreBoundaryInterface f3560a;

    private C0922j(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f3560a = profileStoreBoundaryInterface;
    }

    public static ProfileStore getInstance() {
        if (f3559b == null) {
            f3559b = new C0922j(AbstractC0929q.m4163c().getProfileStore());
        }
        return f3559b;
    }

    @Override // androidx.webkit.ProfileStore
    public boolean deleteProfile(String str) {
        if (AbstractC0928p.f3601d0.mo4147d()) {
            return this.f3560a.deleteProfile(str);
        }
        throw AbstractC0928p.m4158a();
    }

    @Override // androidx.webkit.ProfileStore
    public List getAllProfileNames() {
        if (AbstractC0928p.f3601d0.mo4147d()) {
            return this.f3560a.getAllProfileNames();
        }
        throw AbstractC0928p.m4158a();
    }

    @Override // androidx.webkit.ProfileStore
    public InterfaceC0872b getOrCreateProfile(String str) {
        if (AbstractC0928p.f3601d0.mo4147d()) {
            return new C0921i((ProfileBoundaryInterface) AbstractC0764a.m3594a(ProfileBoundaryInterface.class, this.f3560a.getOrCreateProfile(str)));
        }
        throw AbstractC0928p.m4158a();
    }

    @Override // androidx.webkit.ProfileStore
    public InterfaceC0872b getProfile(String str) {
        if (!AbstractC0928p.f3601d0.mo4147d()) {
            throw AbstractC0928p.m4158a();
        }
        InvocationHandler profile = this.f3560a.getProfile(str);
        if (profile != null) {
            return new C0921i((ProfileBoundaryInterface) AbstractC0764a.m3594a(ProfileBoundaryInterface.class, profile));
        }
        return null;
    }
}
