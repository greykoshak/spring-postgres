
git config --global user.name "Igor Agarkov"
git config --global user.email "igor.agarkov.007@gmail.com"

git remote add origin https://github.com/greykoshak/spring-postgres.git

# Set a new remote

$ git remote -v
# Verify new remote
> origin  https://github.com/OWNER/REPOSITORY.git (fetch)
> origin  https://github.com/OWNER/REPOSITORY.git (push)


git add .
git commit -m "First commit"
git push --set-upstream origin main

git status

git rev-parse --show-toplevel

git clone https://github.com/greykoshak/spring-postgres.git

