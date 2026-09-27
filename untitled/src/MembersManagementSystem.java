import java.util.ArrayList;
import java.util.List;

public class MembersManagementSystem {
    private final List<Member> members=new ArrayList<>();
    public void addMember(Member member){
        for (Member m:members){
            if(m.getId()==member.getId()){
                throw new MemberAlreadyAddedException("This person is already a member of this library");
            }
        }
        members.add(member);
    }
    public void removeMember(Member member){
        for(Member m:members) {
            if (m.getId() == member.getId()) {
                members.remove(member);
                return;
            }
        }throw new NotAMemberException("This person is not a member of this library");
    }
    public void searchMember(Member m){
        for(Member member:members){
            if(member.getId()==m.getId()){
             m.displayDetails();
             m.displayBorrowedBooks();
             return;
            }
        }throw new NotAMemberException("This person is not a member of this library");
    }
}
